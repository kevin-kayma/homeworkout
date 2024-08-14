package com.loseweight
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.play.core.review.ReviewManagerFactory

class ActivityReviewPrompt : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_review_prompt)

        val continueButton: Button = findViewById(R.id.continueButton)

        continueButton.setOnClickListener {
            val manager = ReviewManagerFactory.create(this)
            val requestReview = manager.requestReviewFlow()
            requestReview.addOnCompleteListener { request ->
                if (request.isSuccessful) {
                    // Successfully received ReviewInfo
                    val reviewInfo = request.result
                    val flow = manager.launchReviewFlow(this, reviewInfo)
                    flow.addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            // Review flow completed successfully
                        } else {
                            // Review flow failed
                            Log.e("ReviewFlow", "Review flow failed: ${task.exception}")
                        }
                    }
                } else {
                    // Log the exception and handle the failure gracefully
                    Log.e("ReviewException", "Request review flow failed: ${request.exception}")
                }
            }
            finish()
        }
    }
}