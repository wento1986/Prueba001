public class ActivityIch001 extends AppCompatActivity {

    private static ImageView imgviewh;

    private static Button botonh1;

    private int current_image_heroes;

    int[] IMAGENESH={R.drawable.imh1001,R.drawable.imh2001};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ich001);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        buttononclickh1();
    }
    public void buttononclickh1() {
        imgviewh = (ImageView) findViewById(R.id.imh1001);
        botonh1 = (Button) findViewById(R.id.btnsk1001);
        botonh1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_heroes++;
                        current_image_heroes = current_image_heroes % IMAGENESH.length;
                        imgviewh.setImageResource(IMAGENESH[current_image_heroes]);
                    }
                }
        );
    }

}
