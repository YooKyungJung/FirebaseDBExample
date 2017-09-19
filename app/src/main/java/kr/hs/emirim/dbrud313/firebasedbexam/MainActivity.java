package kr.hs.emirim.dbrud313.firebasedbexam;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private TextView mNameTextView;
    private TextView mGithubTextView;
    private ImageView mProfilImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameTextView=(TextView) findViewById(R.id.profile_name);
        mGithubTextView=(TextView) findViewById(R.id.profile_github);
        mProfilImageView=(ImageView) findViewById(R.id.profile_image);
    }
}
