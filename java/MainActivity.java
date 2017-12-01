public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button ichem001;
    ImageButton icmam001;
    ImageButton icpvpm001;
    ImageButton icpvem001;
    ImageButton ictem001;
    ImageButton icaym001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                getSupportActionBar().hide();
                this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ichem001 = (Button) findViewById(R.id.ichem001);
        ichem001.setOnClickListener(this);
        icmam001 = (ImageButton) findViewById(R.id.icmam001);
        icmam001.setOnClickListener(this);
        icpvpm001 = (ImageButton) findViewById(R.id.icpvpm001);
        icpvpm001.setOnClickListener(this);
        icpvem001 = (ImageButton) findViewById(R.id.icpvem001);
        icpvem001.setOnClickListener(this);
        ictem001 = (ImageButton) findViewById(R.id.ictem001);
        ictem001.setOnClickListener(this);
        icaym001 = (ImageButton) findViewById(R.id.icaym001);
        icaym001.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ichem001:
                Intent IntHeroe = new Intent(this, Activity_Hem.class);
                startActivity(IntHeroe);
                break;
            case R.id.icmam001:
                Intent IntPet = new Intent(this, Activity_Mam.class);
                startActivity(IntPet);
                break;
            case R.id.icpvpm001:
                Intent IntPvp = new Intent(MainActivity.this, Activity_Pvpm.class);
                startActivity(IntPvp);
                break;
            case R.id.icpvem001:
                Intent IntPve = new Intent(MainActivity.this, Activity_Pvem.class);
                startActivity(IntPve);
                break;
            case R.id.ictem001:
                Intent IntTeam = new Intent(MainActivity.this, Activity_Tem.class);
                startActivity(IntTeam);
                break;
            case R.id.icaym001:
                Intent IntAyuda = new Intent(MainActivity.this, Activity_Aym.class);
                startActivity(IntAyuda);
                break;
            default:
                break;
}
    }
}
