public class Activity_Hem extends AppCompatActivity implements View.OnClickListener {

    ImageButton ich001,ich002,ich003,ich004,ich005,ich006,ich007,ich008,ich009,ich010,ich011,ich012,ich013,
            ich014,ich015,ich016,ich017,ich018,ich019,ich020,ich021,ich022,ich023,ich024,ich025,ich026,ich027,ich028,
            ich029,ich030,ich031,ich032,ich033,ich034,ich035,ich036,ich037,ich038,ich039,ich040,ich041,ich042,ich043,
            ich044,ich045,ich046,ich047,ich048,ich049,ich050,ich051,ich052;

    ListAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hem);
                /* Oculta la ActionBar */
        getSupportActionBar().hide();
                /* Oculta la barra de notificaciones*/
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ich001 = (ImageButton) findViewById(R.id.ich001);
        ich001.setOnClickListener(this);
        ich002 = (ImageButton) findViewById(R.id.ich002);
        ich002.setOnClickListener(this);
        ich003 = (ImageButton) findViewById(R.id.ich003);
        ich003.setOnClickListener(this);
        ich004 = (ImageButton) findViewById(R.id.ich004);
        ich004.setOnClickListener(this);
        ich005 = (ImageButton) findViewById(R.id.ich005);
        ich005.setOnClickListener(this);
        ich006 = (ImageButton) findViewById(R.id.ich006);
        ich006.setOnClickListener(this);
        ich007 = (ImageButton) findViewById(R.id.ich007);
        ich007.setOnClickListener(this);
        ich008 = (ImageButton) findViewById(R.id.ich008);
        ich008.setOnClickListener(this);
        ich009 = (ImageButton) findViewById(R.id.ich009);
        ich009.setOnClickListener(this);
        ich010 = (ImageButton) findViewById(R.id.ich010);
        ich010.setOnClickListener(this);
        ich011 = (ImageButton) findViewById(R.id.ich011);
        ich011.setOnClickListener(this);
        ich012 = (ImageButton) findViewById(R.id.ich012);
        ich012.setOnClickListener(this);
        ich013 = (ImageButton) findViewById(R.id.ich013);
        ich013.setOnClickListener(this);
        ich014 = (ImageButton) findViewById(R.id.ich014);
        ich014.setOnClickListener(this);
        ich015 = (ImageButton) findViewById(R.id.ich015);
        ich015.setOnClickListener(this);
        ich016 = (ImageButton) findViewById(R.id.ich016);
        ich016.setOnClickListener(this);
        ich017 = (ImageButton) findViewById(R.id.ich017);
        ich017.setOnClickListener(this);
        ich018 = (ImageButton) findViewById(R.id.ich018);
        ich018.setOnClickListener(this);
        ich019 = (ImageButton) findViewById(R.id.ich019);
        ich019.setOnClickListener(this);
        ich020 = (ImageButton) findViewById(R.id.ich020);
        ich020.setOnClickListener(this);
        ich021 = (ImageButton) findViewById(R.id.ich021);
        ich021.setOnClickListener(this);
        ich022 = (ImageButton) findViewById(R.id.ich022);
        ich022.setOnClickListener(this);
        ich023 = (ImageButton) findViewById(R.id.ich023);
        ich023.setOnClickListener(this);
        ich024 = (ImageButton) findViewById(R.id.ich024);
        ich024.setOnClickListener(this);
        ich025 = (ImageButton) findViewById(R.id.ich025);
        ich025.setOnClickListener(this);
        ich026 = (ImageButton) findViewById(R.id.ich026);
        ich026.setOnClickListener(this);
        ich027 = (ImageButton) findViewById(R.id.ich027);
        ich027.setOnClickListener(this);
        ich028 = (ImageButton) findViewById(R.id.ich028);
        ich028.setOnClickListener(this);
        ich029 = (ImageButton) findViewById(R.id.ich029);
        ich029.setOnClickListener(this);
        ich030 = (ImageButton) findViewById(R.id.ich030);
        ich030.setOnClickListener(this);
        ich031 = (ImageButton) findViewById(R.id.ich031);
        ich031.setOnClickListener(this);
        ich032 = (ImageButton) findViewById(R.id.ich032);
        ich032.setOnClickListener(this);
        ich033 = (ImageButton) findViewById(R.id.ich033);
        ich033.setOnClickListener(this);
        ich034 = (ImageButton) findViewById(R.id.ich034);
        ich034.setOnClickListener(this);
        ich035 = (ImageButton) findViewById(R.id.ich035);
        ich035.setOnClickListener(this);
        ich036 = (ImageButton) findViewById(R.id.ich036);
        ich036.setOnClickListener(this);
        ich037 = (ImageButton) findViewById(R.id.ich037);
        ich037.setOnClickListener(this);
        ich038 = (ImageButton) findViewById(R.id.ich038);
        ich038.setOnClickListener(this);
        ich039 = (ImageButton) findViewById(R.id.ich039);
        ich039.setOnClickListener(this);
        ich040 = (ImageButton) findViewById(R.id.ich040);
        ich040.setOnClickListener(this);
        ich041 = (ImageButton) findViewById(R.id.ich041);
        ich041.setOnClickListener(this);
        ich042 = (ImageButton) findViewById(R.id.ich042);
        ich042.setOnClickListener(this);
        ich043 = (ImageButton) findViewById(R.id.ich043);
        ich043.setOnClickListener(this);
        ich044 = (ImageButton) findViewById(R.id.ich044);
        ich044.setOnClickListener(this);
        ich045 = (ImageButton) findViewById(R.id.ich045);
        ich045.setOnClickListener(this);
        ich046 = (ImageButton) findViewById(R.id.ich046);
        ich046.setOnClickListener(this);
        ich047 = (ImageButton) findViewById(R.id.ich047);
        ich047.setOnClickListener(this);
        ich048 = (ImageButton) findViewById(R.id.ich048);
        ich048.setOnClickListener(this);
        ich049 = (ImageButton) findViewById(R.id.ich049);
        ich049.setOnClickListener(this);
        ich050 = (ImageButton) findViewById(R.id.ich050);
        ich050.setOnClickListener(this);
        ich051 = (ImageButton) findViewById(R.id.ich051);
        ich051.setOnClickListener(this);
        ich052 = (ImageButton) findViewById(R.id.ich052);
        ich052.setOnClickListener(this);
    }
    @Override
    public void onClick (View v){
        switch (v.getId()){
            case R.id.ich001:
                Intent intich001 = new Intent(this,ActivityIch001.class);
                startActivity(intich001);
                break;
            case R.id.ich002:
                Intent intich002 = new Intent(this,ActivityIch002.class);
                startActivity(intich002);
                break;
            case R.id.ich003:
                Intent intich003 = new Intent(this,ActivityIch003.class);
                startActivity(intich003);
                break;
            case R.id.ich004:
                Intent intich004 = new Intent(this,ActivityIch004.class);
                startActivity(intich004);
                break;
            case R.id.ich005:
                Intent intich005 = new Intent(this,ActivityIch005.class);
                startActivity(intich005);
                break;
            case R.id.ich006:
                Intent intich006 = new Intent(this,ActivityIch006.class);
                startActivity(intich006);
                break;
            case R.id.ich007:
                Intent intich007 = new Intent(this,ActivityIch007.class);
                startActivity(intich007);
                break;
            case R.id.ich008:
                Intent intich008 = new Intent(this,ActivityIch008.class);
                startActivity(intich008);
                break;
            case R.id.ich009:
                Intent intich009 = new Intent(this,ActivityIch009.class);
                startActivity(intich009);
                break;
            case R.id.ich010:
                Intent intich010 = new Intent(this,ActivityIch010.class);
                startActivity(intich010);
                break;
            case R.id.ich011:
                Intent intich011 = new Intent(this,ActivityIch011.class);
                startActivity(intich011);
                break;
            case R.id.ich012:
                Intent intich012 = new Intent(this,ActivityIch012.class);
                startActivity(intich012);
                break;
            case R.id.ich013:
                Intent intich013 = new Intent(this,ActivityIch013.class);
                startActivity(intich013);
                break;
            case R.id.ich014:
                Intent intich014 = new Intent(this,ActivityIch014.class);
                startActivity(intich014);
                break;
            case R.id.ich015:
                Intent intich015 = new Intent(this,ActivityIch015.class);
                startActivity(intich015);
                break;
            case R.id.ich016:
                Intent intich016 = new Intent(this,ActivityIch016.class);
                startActivity(intich016);
                break;
            case R.id.ich017:
                Intent intich017 = new Intent(this,ActivityIch017.class);
                startActivity(intich017);
                break;
            case R.id.ich018:
                Intent intich018 = new Intent(this,ActivityIch018.class);
                startActivity(intich018);
                break;
            case R.id.ich019:
                Intent intich019 = new Intent(this,ActivityIch019.class);
                startActivity(intich019);
                break;
            case R.id.ich020:
                Intent intich020 = new Intent(this,ActivityIch020.class);
                startActivity(intich020);
                break;
            case R.id.ich021:
                Intent intich021 = new Intent(this,ActivityIch021.class);
                startActivity(intich021);
                break;
            case R.id.ich022:
                Intent intich022 = new Intent(this,ActivityIch022.class);
                startActivity(intich022);
                break;
            case R.id.ich023:
                Intent intich023 = new Intent(this,ActivityIch023.class);
                startActivity(intich023);
                break;
            case R.id.ich024:
                Intent intich024 = new Intent(this,ActivityIch024.class);
                startActivity(intich024);
                break;
            case R.id.ich025:
                Intent intich025 = new Intent(this,ActivityIch025.class);
                startActivity(intich025);
                break;
            case R.id.ich026:
                Intent intich026 = new Intent(this,ActivityIch026.class);
                startActivity(intich026);
                break;
            case R.id.ich027:
                Intent intich027 = new Intent(this,ActivityIch027.class);
                startActivity(intich027);
                break;
            case R.id.ich028:
                Intent intich028 = new Intent(this,ActivityIch028.class);
                startActivity(intich028);
                break;
            case R.id.ich029:
                Intent intich029 = new Intent(this,ActivityIch029.class);
                startActivity(intich029);
                break;
            case R.id.ich030:
                Intent intich030 = new Intent(this,ActivityIch030.class);
                startActivity(intich030);
                break;
            case R.id.ich031:
                Intent intich031 = new Intent(this,ActivityIch031.class);
                startActivity(intich031);
                break;
            case R.id.ich032:
                Intent intich032 = new Intent(this,ActivityIch032.class);
                startActivity(intich032);
                break;
            case R.id.ich033:
                Intent intich033 = new Intent(this,ActivityIch033.class);
                startActivity(intich033);
                break;
            case R.id.ich034:
                Intent intich034 = new Intent(this,ActivityIch034.class);
                startActivity(intich034);
                break;
            case R.id.ich035:
                Intent intich035 = new Intent(this,ActivityIch035.class);
                startActivity(intich035);
                break;
            case R.id.ich036:
                Intent intich036 = new Intent(this,ActivityIch036.class);
                startActivity(intich036);
                break;case R.id.ich037:
                Intent intich037 = new Intent(this,ActivityIch037.class);
                startActivity(intich037);
                break;
            case R.id.ich038:
                Intent intich038 = new Intent(this,ActivityIch038.class);
                startActivity(intich038);
                break;
            case R.id.ich039:
                Intent intich039 = new Intent(this,ActivityIch039.class);
                startActivity(intich039);
                break;
            case R.id.ich040:
                Intent intich040 = new Intent(this,ActivityIch040.class);
                startActivity(intich040);
                break;
            case R.id.ich041:
                Intent intich041 = new Intent(this,ActivityIch041.class);
                startActivity(intich041);
                break;
            case R.id.ich042:
                Intent intich042 = new Intent(this,ActivityIch042.class);
                startActivity(intich042);
                break;
            case R.id.ich043:
                Intent intich043 = new Intent(this,ActivityIch043.class);
                startActivity(intich043);
                break;
            case R.id.ich044:
                Intent intich044 = new Intent(this,ActivityIch044.class);
                startActivity(intich044);
                break;
            case R.id.ich045:
                Intent intich045 = new Intent(this,ActivityIch045.class);
                startActivity(intich045);
                break;
            case R.id.ich046:
                Intent intich046 = new Intent(this,ActivityIch046.class);
                startActivity(intich046);
                break;
            case R.id.ich047:
                Intent intich047 = new Intent(this,ActivityIch047.class);
                startActivity(intich047);
                break;
            case R.id.ich048:
                Intent intich048 = new Intent(this,ActivityIch048.class);
                startActivity(intich048);
                break;
            case R.id.ich049:
                Intent intich049 = new Intent(this,ActivityIch049.class);
                startActivity(intich049);
                break;
            case R.id.ich050:
                Intent intich050 = new Intent(this,ActivityIch050.class);
                startActivity(intich050);
                break;
            case R.id.ich051:
                Intent intich051 = new Intent(this,ActivityIch051.class);
                startActivity(intich051);
                break;
            case R.id.ich052:
                Intent intich052 = new Intent(this,ActivityIch052.class);
                startActivity(intich052);
                break;
                default:
                    break;
        }
    }
}
