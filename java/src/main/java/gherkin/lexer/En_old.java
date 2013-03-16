
// line 1 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
package gherkin.lexer;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;
import gherkin.lexer.Lexer;
import gherkin.lexer.Listener;
import gherkin.lexer.LexingError;

public class En_old implements Lexer {
  
// line 150 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"


  private final Listener listener;

  public En_old(Listener listener) {
    this.listener = listener;
  }

  
// line 26 "java/src/main/java/gherkin/lexer/En_old.java"
private static byte[] init__lexer_actions_0()
{
	return new byte [] {
	    0,    1,    0,    1,    1,    1,    2,    1,    3,    1,    4,    1,
	    5,    1,    6,    1,    7,    1,    8,    1,    9,    1,   10,    1,
	   11,    1,   12,    1,   13,    1,   16,    1,   17,    1,   18,    1,
	   19,    1,   20,    1,   21,    1,   22,    1,   23,    2,    2,   18,
	    2,    3,    4,    2,   13,    0,    2,   14,   15,    2,   17,    0,
	    2,   17,    1,    2,   17,   16,    2,   17,   19,    2,   18,    6,
	    2,   18,    7,    2,   18,    8,    2,   18,    9,    2,   18,   10,
	    2,   18,   16,    2,   20,   21,    2,   22,    0,    2,   22,    1,
	    2,   22,   16,    2,   22,   19,    3,    4,   14,   15,    3,    5,
	   14,   15,    3,   11,   14,   15,    3,   12,   14,   15,    3,   13,
	   14,   15,    3,   14,   15,   18,    3,   17,    0,   11,    3,   17,
	   14,   15,    4,    2,   14,   15,   18,    4,    3,    4,   14,   15,
	    4,   17,    0,   14,   15,    5,   17,    0,   11,   14,   15
	};
}

private static final byte _lexer_actions[] = init__lexer_actions_0();


private static short[] init__lexer_key_offsets_0()
{
	return new short [] {
	    0,    0,   18,   21,   22,   23,   24,   25,   40,   43,   46,   48,
	   65,   69,   71,   72,   75,   77,   94,   95,   96,   98,  100,  105,
	  110,  115,  120,  124,  128,  130,  131,  132,  133,  134,  135,  136,
	  137,  138,  139,  140,  141,  142,  143,  144,  145,  146,  148,  153,
	  160,  165,  167,  168,  170,  171,  172,  173,  174,  175,  186,  188,
	  190,  192,  209,  210,  211,  213,  214,  216,  218,  219,  220,  221,
	  222,  229,  231,  234,  236,  238,  240,  242,  243,  244,  246,  247,
	  248,  250,  251,  252,  253,  254,  255,  256,  257,  258,  259,  274,
	  277,  280,  282,  299,  303,  305,  306,  309,  312,  315,  318,  319,
	  320,  321,  322,  323,  325,  326,  329,  332,  336,  342,  345,  347,
	  353,  370,  372,  374,  376,  379,  381,  398,  402,  404,  406,  408,
	  410,  412,  414,  416,  418,  420,  422,  424,  426,  428,  430,  432,
	  434,  437,  439,  441,  443,  445,  447,  449,  451,  453,  455,  458,
	  460,  478,  479,  480,  481,  482,  497,  501,  503,  505,  508,  510,
	  527,  531,  532,  533,  535,  537,  539,  542,  544,  561,  565,  567,
	  569,  571,  573,  575,  577,  579,  581,  583,  585,  587,  589,  591,
	  593,  596,  598,  601,  603,  605,  607,  609,  611,  613,  615,  618,
	  620,  622,  625,  627,  629,  631,  633,  635,  637,  639,  641,  644,
	  646,  664,  665,  667,  669,  671,  673,  675,  677,  679,  681,  683,
	  685,  687,  689,  691,  693,  695,  697,  700,  702,  704,  706,  709,
	  711,  714,  717,  719,  721,  723,  726,  728,  730,  733,  735,  737,
	  739,  741,  743,  745,  747,  748,  751,  752,  753,  755,  757,  759,
	  762,  764,  781,  785,  787,  789,  791,  793,  795,  797,  799,  801,
	  803,  805,  807,  809,  811,  813,  815,  817,  820,  822,  824,  826,
	  828,  830,  832,  834,  836,  839,  841,  843,  846,  848,  850,  852,
	  854,  856,  858,  860,  862,  865,  867,  885,  886,  887,  888
	};
}

private static final short _lexer_key_offsets[] = init__lexer_key_offsets_0();


private static byte[] init__lexer_trans_keys_0()
{
	return new byte [] {
	  -61,  -17,   10,   32,   34,   35,   37,   42,   55,   64,   65,   72,
	   79,   83,   84,  124,    9,   13, -122, -112,  -98,  114,   58,   10,
	   10,  -61,   10,   32,   35,   37,   42,   55,   64,   65,   72,   79,
	   83,   84,    9,   13, -112,  -98,   10,   10,   97,  117,   10,   32,
	  -61,   10,   32,   34,   35,   37,   42,   55,   64,   65,   72,   79,
	   83,   84,  124,    9,   13, -122, -112,  -98,  -80,   97,  117,   32,
	  -61,   10,   13,   10,   13,  -61,   10,   32,   34,   35,   37,   42,
	   55,   64,   65,   72,   79,   83,   84,  124,    9,   13,   34,   34,
	   10,   13,   10,   13,   10,   32,   34,    9,   13,   10,   32,   34,
	    9,   13,   10,   32,   34,    9,   13,   10,   32,   34,    9,   13,
	   10,   32,    9,   13,   10,   32,    9,   13,   10,   13,   10,   95,
	   70,   69,   65,   84,   85,   82,   69,   95,   69,   78,   68,   95,
	   37,   32,   10,   13,   13,   32,   64,    9,   10,    9,   10,   13,
	   32,   64,   11,   12,   10,   32,   64,    9,   13,   99,  101,  119,
	  -61,   97,  -90,  116,   58,   10,   10,  -61,   10,   32,   35,   37,
	   64,   65,   72,   83,    9,   13, -122,   10,   10,  114,   10,   58,
	  -61,   10,   32,   34,   35,   37,   42,   55,   64,   65,   72,   79,
	   83,   84,  124,    9,   13,  110,  100,  101,  119,   32,  -61,  116,
	  -80,  -66,  101,   58,   10,   10,   10,   32,   35,   72,  124,    9,
	   13,   10,  119,  -61,   10,   97,  -90,   10,   10,  116,   10,   58,
	   10,  101,  104,   97,   32,   58,  104,  119,  -61,   97,  -90,  114,
	   32,  115,  119,   97,   58,   10,   10,  -61,   10,   32,   35,   37,
	   42,   55,   64,   65,   72,   79,   83,   84,    9,   13, -112,  -98,
	   10,   10,   97,  117,   10,   32,  -61,   10,   32,   34,   35,   37,
	   42,   55,   64,   65,   72,   79,   83,   84,  124,    9,   13, -122,
	 -112,  -98,  -80,   97,  117,   32,  -61,   10,   13,  -66,   10,   13,
	   10,   13,  101,   10,   13,   32,  114,  104,  101,   32,  104,   97,
	  117,   32,   10,   13,  116,   10,   13,  104,   32,  124,    9,   13,
	   10,   32,   92,  124,    9,   13,   10,   92,  124,   10,   92,   10,
	   32,   92,  124,    9,   13,  -61,   10,   32,   34,   35,   37,   42,
	   55,   64,   65,   72,   79,   83,   84,  124,    9,   13,   10,  114,
	   10,  104,   10,   32,   10,   97,  117,   10,   32,  -61,   10,   32,
	   34,   35,   37,   42,   55,   64,   65,   72,   79,   83,   84,  124,
	    9,   13, -122, -112,  -98,  -66,   10,   95,   10,   70,   10,   69,
	   10,   65,   10,   84,   10,   85,   10,   82,   10,   69,   10,   95,
	   10,   69,   10,   78,   10,   68,   10,   95,   10,   37,   10,   99,
	   10,  119,  -61,   10,   97,  -90,   10,   10,  116,   10,   58,   10,
	  101,   10,  110,   10,  100,   10,  119,   10,   97,   10,  104,   10,
	   97,  117,   10,   32,  -61,   10,   32,   34,   35,   37,   42,   55,
	   64,   65,   72,   79,   83,   84,  116,  124,    9,   13,  104,  101,
	   10,   10,  -61,   10,   32,   35,   37,   42,   55,   64,   65,   72,
	   79,   83,   84,    9,   13, -122, -112,  -98,   10,   10,  114,   10,
	   58,   10,   97,  117,   10,   32,  -61,   10,   32,   34,   35,   37,
	   42,   55,   64,   65,   72,   79,   83,   84,  124,    9,   13, -122,
	 -112,  -98,  -80,  101,   32,   10,  114,   10,  104,   10,   32,   10,
	   97,  117,   10,   32,  -61,   10,   32,   34,   35,   37,   42,   55,
	   64,   65,   72,   79,   83,   84,  124,    9,   13, -122, -112,  -98,
	  -66,   10,   95,   10,   70,   10,   69,   10,   65,   10,   84,   10,
	   85,   10,   82,   10,   69,   10,   95,   10,   69,   10,   78,   10,
	   68,   10,   95,   10,   37,   10,   99,  101,   10,  119,  -61,   10,
	   97,  -90,   10,   10,  116,   10,  101,   10,  110,   10,  100,   10,
	  119,   10,   97,   10,   32,   58,   10,  104,   10,  119,  -61,   10,
	   97,  -90,   10,   10,  114,   10,   32,   10,  115,   10,  119,   10,
	   97,   10,  101,   10,  104,   10,   97,  117,   10,   32,  -61,   10,
	   32,   34,   35,   37,   42,   55,   64,   65,   72,   79,   83,   84,
	  116,  124,    9,   13,  104,   10,   95,   10,   70,   10,   69,   10,
	   65,   10,   84,   10,   85,   10,   82,   10,   69,   10,   95,   10,
	   69,   10,   78,   10,   68,   10,   95,   10,   37,   10,  101,   10,
	  119,  -61,   10,   97,  -90,   10,   10,  116,   10,  101,   10,  101,
	  119,   10,   32,  -61,   10,  116,  -80,  -66,   10,   10,  101,   10,
	  104,   10,   97,   10,   32,   58,   10,  104,   10,  119,  -61,   10,
	   97,  -90,   10,   10,  114,   10,   32,   10,  115,   10,  119,   10,
	   97,   10,  101,  101,  -80,   10,   13,  101,   32,   10,  114,   10,
	  104,   10,   32,   10,   97,  117,   10,   32,  -61,   10,   32,   34,
	   35,   37,   42,   55,   64,   65,   72,   79,   83,   84,  124,    9,
	   13, -122, -112,  -98,  -66,   10,   95,   10,   70,   10,   69,   10,
	   65,   10,   84,   10,   85,   10,   82,   10,   69,   10,   95,   10,
	   69,   10,   78,   10,   68,   10,   95,   10,   37,   10,   99,   10,
	  119,  -61,   10,   97,  -90,   10,   10,  116,   10,   58,   10,  101,
	   10,  110,   10,  100,   10,  119,   10,   97,   10,   32,   58,   10,
	  104,   10,  119,  -61,   10,   97,  -90,   10,   10,  114,   10,   32,
	   10,  115,   10,  119,   10,   97,   10,  101,   10,  104,   10,   97,
	  117,   10,   32,  -61,   10,   32,   34,   35,   37,   42,   55,   64,
	   65,   72,   79,   83,   84,  116,  124,    9,   13,  104,  -69,  -65,
	    0
	};
}

private static final byte _lexer_trans_keys[] = init__lexer_trans_keys_0();


private static byte[] init__lexer_single_lengths_0()
{
	return new byte [] {
	    0,   16,    3,    1,    1,    1,    1,   13,    3,    3,    2,   15,
	    4,    2,    1,    3,    2,   15,    1,    1,    2,    2,    3,    3,
	    3,    3,    2,    2,    2,    1,    1,    1,    1,    1,    1,    1,
	    1,    1,    1,    1,    1,    1,    1,    1,    1,    2,    3,    5,
	    3,    2,    1,    2,    1,    1,    1,    1,    1,    9,    2,    2,
	    2,   15,    1,    1,    2,    1,    2,    2,    1,    1,    1,    1,
	    5,    2,    3,    2,    2,    2,    2,    1,    1,    2,    1,    1,
	    2,    1,    1,    1,    1,    1,    1,    1,    1,    1,   13,    3,
	    3,    2,   15,    4,    2,    1,    3,    3,    3,    3,    1,    1,
	    1,    1,    1,    2,    1,    3,    3,    2,    4,    3,    2,    4,
	   15,    2,    2,    2,    3,    2,   15,    4,    2,    2,    2,    2,
	    2,    2,    2,    2,    2,    2,    2,    2,    2,    2,    2,    2,
	    3,    2,    2,    2,    2,    2,    2,    2,    2,    2,    3,    2,
	   16,    1,    1,    1,    1,   13,    4,    2,    2,    3,    2,   15,
	    4,    1,    1,    2,    2,    2,    3,    2,   15,    4,    2,    2,
	    2,    2,    2,    2,    2,    2,    2,    2,    2,    2,    2,    2,
	    3,    2,    3,    2,    2,    2,    2,    2,    2,    2,    3,    2,
	    2,    3,    2,    2,    2,    2,    2,    2,    2,    2,    3,    2,
	   16,    1,    2,    2,    2,    2,    2,    2,    2,    2,    2,    2,
	    2,    2,    2,    2,    2,    2,    3,    2,    2,    2,    3,    2,
	    3,    3,    2,    2,    2,    3,    2,    2,    3,    2,    2,    2,
	    2,    2,    2,    2,    1,    3,    1,    1,    2,    2,    2,    3,
	    2,   15,    4,    2,    2,    2,    2,    2,    2,    2,    2,    2,
	    2,    2,    2,    2,    2,    2,    2,    3,    2,    2,    2,    2,
	    2,    2,    2,    2,    3,    2,    2,    3,    2,    2,    2,    2,
	    2,    2,    2,    2,    3,    2,   16,    1,    1,    1,    0
	};
}

private static final byte _lexer_single_lengths[] = init__lexer_single_lengths_0();


private static byte[] init__lexer_range_lengths_0()
{
	return new byte [] {
	    0,    1,    0,    0,    0,    0,    0,    1,    0,    0,    0,    1,
	    0,    0,    0,    0,    0,    1,    0,    0,    0,    0,    1,    1,
	    1,    1,    1,    1,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    1,    1,
	    1,    0,    0,    0,    0,    0,    0,    0,    0,    1,    0,    0,
	    0,    1,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    1,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    1,    0,
	    0,    0,    1,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    1,    1,    0,    0,    1,
	    1,    0,    0,    0,    0,    0,    1,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    1,    0,    0,    0,    0,    1,    0,    0,    0,    0,    0,    1,
	    0,    0,    0,    0,    0,    0,    0,    0,    1,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    1,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    1,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    1,    0,    0,    0,    0
	};
}

private static final byte _lexer_range_lengths[] = init__lexer_range_lengths_0();


private static short[] init__lexer_index_offsets_0()
{
	return new short [] {
	    0,    0,   18,   22,   24,   26,   28,   30,   45,   49,   53,   56,
	   73,   78,   81,   83,   87,   90,  107,  109,  111,  114,  117,  122,
	  127,  132,  137,  141,  145,  148,  150,  152,  154,  156,  158,  160,
	  162,  164,  166,  168,  170,  172,  174,  176,  178,  180,  183,  188,
	  195,  200,  203,  205,  208,  210,  212,  214,  216,  218,  229,  232,
	  235,  238,  255,  257,  259,  262,  264,  267,  270,  272,  274,  276,
	  278,  285,  288,  292,  295,  298,  301,  304,  306,  308,  311,  313,
	  315,  318,  320,  322,  324,  326,  328,  330,  332,  334,  336,  351,
	  355,  359,  362,  379,  384,  387,  389,  393,  397,  401,  405,  407,
	  409,  411,  413,  415,  418,  420,  424,  428,  432,  438,  442,  445,
	  451,  468,  471,  474,  477,  481,  484,  501,  506,  509,  512,  515,
	  518,  521,  524,  527,  530,  533,  536,  539,  542,  545,  548,  551,
	  554,  558,  561,  564,  567,  570,  573,  576,  579,  582,  585,  589,
	  592,  610,  612,  614,  616,  618,  633,  638,  641,  644,  648,  651,
	  668,  673,  675,  677,  680,  683,  686,  690,  693,  710,  715,  718,
	  721,  724,  727,  730,  733,  736,  739,  742,  745,  748,  751,  754,
	  757,  761,  764,  768,  771,  774,  777,  780,  783,  786,  789,  793,
	  796,  799,  803,  806,  809,  812,  815,  818,  821,  824,  827,  831,
	  834,  852,  854,  857,  860,  863,  866,  869,  872,  875,  878,  881,
	  884,  887,  890,  893,  896,  899,  902,  906,  909,  912,  915,  919,
	  922,  926,  930,  933,  936,  939,  943,  946,  949,  953,  956,  959,
	  962,  965,  968,  971,  974,  976,  980,  982,  984,  987,  990,  993,
	  997, 1000, 1017, 1022, 1025, 1028, 1031, 1034, 1037, 1040, 1043, 1046,
	 1049, 1052, 1055, 1058, 1061, 1064, 1067, 1070, 1074, 1077, 1080, 1083,
	 1086, 1089, 1092, 1095, 1098, 1102, 1105, 1108, 1112, 1115, 1118, 1121,
	 1124, 1127, 1130, 1133, 1136, 1140, 1143, 1161, 1163, 1165, 1167
	};
}

private static final short _lexer_index_offsets[] = init__lexer_index_offsets_0();


private static short[] init__lexer_indicies_0()
{
	return new short [] {
	    1,    2,    4,    3,    5,    6,    7,    8,    8,    9,   10,   11,
	   12,   13,   14,   15,    3,    0,   16,   17,   18,    0,   19,    0,
	   20,    0,   22,   21,   24,   23,   25,   24,   26,   27,   28,   29,
	   29,   27,   30,   31,   32,   33,   34,   26,   23,   35,   36,   24,
	   23,   24,   37,   38,   23,   24,   39,   23,   40,   42,   41,   43,
	   44,   45,   46,   46,   47,   48,   49,   50,   51,   52,   53,   41,
	    0,   16,   17,   18,   54,    0,   55,   56,    0,   57,    0,   59,
	   60,   61,   58,   63,   64,   62,    1,    4,    3,    5,    6,    7,
	    8,    8,    9,   10,   11,   12,   13,   14,   15,    3,    0,   65,
	    0,   66,    0,   68,   69,   67,   71,   72,   70,   75,   74,   76,
	   74,   73,   79,   78,   80,   78,   77,   79,   78,   81,   78,   77,
	   79,   78,   82,   78,   77,   84,   83,   83,    0,    4,   85,   85,
	    0,   87,   88,   86,    4,    0,   89,    0,   90,    0,   91,    0,
	   92,    0,   93,    0,   94,    0,   95,    0,   96,    0,   97,    0,
	   98,    0,   99,    0,  100,    0,  101,    0,  102,    0,  103,    0,
	   60,   61,   58,    0,    0,    0,    0,  104,  105,  106,  105,  105,
	  108,  107,  104,    4,  109,    9,  109,    0,  110,   16,    0,  111,
	    0,  112,  113,    0,  114,    0,  115,    0,  116,    0,  118,  117,
	  120,  119,  121,  120,  122,  123,  124,  123,  125,  126,  127,  122,
	  119,  128,  120,  119,  120,  129,  119,  120,  130,  119,  131,   42,
	   41,   43,   44,   45,   46,   46,   47,   48,   49,   50,   51,   52,
	   53,   41,    0,  132,    0,  110,    0,  133,  134,    0,  135,    0,
	  136,  137,    0,  138,  138,    0,  139,    0,  140,    0,  142,  141,
	  144,  143,  144,  145,  146,  147,  146,  145,  143,  144,  148,  143,
	  149,  144,  150,  143,  151,  144,  143,  144,  152,  143,  144,  153,
	  143,  144,  151,  143,  138,    0,  154,    0,  155,  156,    0,  157,
	    0,  158,    0,  159,  160,    0,  161,    0,  162,    0,  163,    0,
	  164,    0,  165,    0,  166,    0,  167,    0,  169,  168,  171,  170,
	  172,  171,  173,  174,  175,  176,  176,  174,  177,  178,  179,  180,
	  181,  173,  170,  182,  183,  171,  170,  171,  184,  185,  170,  171,
	  186,  170,  187,   42,   41,   43,   44,   45,   46,   46,   47,   48,
	   49,   50,   51,   52,   53,   41,    0,   16,   17,   18,  188,    0,
	  189,   56,    0,  190,    0,  191,   60,   61,   58,  192,   63,   64,
	   62,   63,   64,  193,   62,   63,   64,  103,   62,  194,    0,  110,
	    0,  195,    0,  196,    0,  197,    0,  198,   56,    0,  199,    0,
	   60,   61,  200,   58,   63,   64,  192,   62,  201,  202,  201,    0,
	  205,  204,  206,  207,  204,  203,    0,  209,  210,  208,    0,  209,
	  208,  205,  211,  209,  210,  211,  208,  212,  205,  213,  214,  215,
	  216,  217,  217,  218,  219,  220,  221,  222,  223,  224,  213,    0,
	  171,  225,  170,  171,  226,  170,  171,  196,  170,  171,  227,  185,
	  170,  171,  228,  170,  229,   42,   41,   43,   44,   45,   46,   46,
	   47,   48,   49,   50,   51,   52,   53,   41,    0,   16,   17,   18,
	  188,    0,  171,  230,  170,  171,  231,  170,  171,  232,  170,  171,
	  233,  170,  171,  234,  170,  171,  235,  170,  171,  236,  170,  171,
	  237,  170,  171,  238,  170,  171,  239,  170,  171,  240,  170,  171,
	  241,  170,  171,  242,  170,  171,  243,  170,  171,  226,  170,  171,
	  244,  170,  245,  171,  246,  170,  247,  171,  170,  171,  248,  170,
	  171,  196,  170,  171,  247,  170,  171,  249,  170,  171,  226,  170,
	  171,  250,  170,  171,  248,  170,  171,  251,  170,  171,  252,  185,
	  170,  171,  253,  170,  131,   42,   41,   43,   44,   45,   46,   46,
	   47,   48,   49,   50,   51,   52,  254,   53,   41,    0,  188,    0,
	  161,    0,  256,  255,  258,  257,  259,  258,  260,  261,  262,  263,
	  263,  261,  264,  265,  266,  267,  268,  260,  257,  269,  270,  271,
	  258,  257,  258,  272,  257,  258,  273,  257,  258,  274,  275,  257,
	  258,  276,  257,  277,   42,   41,   43,   44,   45,   46,   46,   47,
	   48,   49,   50,   51,   52,   53,   41,    0,   16,   17,   18,  278,
	    0,  279,    0,  273,    0,  258,  280,  257,  258,  281,  257,  258,
	  273,  257,  258,  282,  275,  257,  258,  283,  257,  284,   42,   41,
	   43,   44,   45,   46,   46,   47,   48,   49,   50,   51,   52,   53,
	   41,    0,   16,   17,   18,  278,    0,  258,  285,  257,  258,  286,
	  257,  258,  287,  257,  258,  288,  257,  258,  289,  257,  258,  290,
	  257,  258,  291,  257,  258,  292,  257,  258,  293,  257,  258,  294,
	  257,  258,  295,  257,  258,  296,  257,  258,  297,  257,  258,  298,
	  257,  258,  281,  269,  257,  258,  299,  257,  300,  258,  301,  257,
	  302,  258,  257,  258,  272,  257,  258,  302,  257,  258,  303,  257,
	  258,  281,  257,  258,  304,  257,  258,  305,  257,  258,  306,  273,
	  257,  258,  307,  257,  258,  308,  257,  309,  258,  310,  257,  311,
	  258,  257,  258,  312,  257,  258,  313,  257,  258,  314,  257,  258,
	  315,  257,  258,  272,  257,  258,  311,  257,  258,  316,  257,  258,
	  317,  275,  257,  258,  318,  257,  131,   42,   41,   43,   44,   45,
	   46,   46,   47,   48,   49,   50,   51,   52,  319,   53,   41,    0,
	  278,    0,  120,  320,  119,  120,  321,  119,  120,  322,  119,  120,
	  323,  119,  120,  324,  119,  120,  325,  119,  120,  326,  119,  120,
	  327,  119,  120,  328,  119,  120,  329,  119,  120,  330,  119,  120,
	  331,  119,  120,  332,  119,  120,  333,  119,  120,  128,  119,  120,
	  334,  119,  335,  120,  336,  119,  337,  120,  119,  120,  129,  119,
	  120,  337,  119,  120,  338,  339,  119,  120,  340,  119,  341,  120,
	  342,  119,  343,  343,  120,  119,  120,  129,  119,  120,  343,  119,
	  120,  344,  119,  120,  345,  130,  119,  120,  346,  119,  120,  347,
	  119,  348,  120,  349,  119,  350,  120,  119,  120,  351,  119,  120,
	  352,  119,  120,  353,  119,  120,  354,  119,  120,  129,  119,  120,
	  350,  119,  114,    0,  192,   63,   64,   62,  355,    0,  356,    0,
	   24,  357,   23,   24,  358,   23,   24,  356,   23,   24,  359,   38,
	   23,   24,  360,   23,  361,   42,   41,   43,   44,   45,   46,   46,
	   47,   48,   49,   50,   51,   52,   53,   41,    0,   16,   17,   18,
	   54,    0,   24,  362,   23,   24,  363,   23,   24,  364,   23,   24,
	  365,   23,   24,  366,   23,   24,  367,   23,   24,  368,   23,   24,
	  369,   23,   24,  370,   23,   24,  371,   23,   24,  372,   23,   24,
	  373,   23,   24,  374,   23,   24,  375,   23,   24,  358,   23,   24,
	  376,   23,  377,   24,  378,   23,  379,   24,   23,   24,  380,   23,
	   24,  356,   23,   24,  379,   23,   24,  381,   23,   24,  358,   23,
	   24,  382,   23,   24,  383,   23,   24,  384,  356,   23,   24,  385,
	   23,   24,  386,   23,  387,   24,  388,   23,  389,   24,   23,   24,
	  390,   23,   24,  391,   23,   24,  392,   23,   24,  393,   23,   24,
	  380,   23,   24,  389,   23,   24,  394,   23,   24,  395,   38,   23,
	   24,  396,   23,  131,   42,   41,   43,   44,   45,   46,   46,   47,
	   48,   49,   50,   51,   52,  397,   53,   41,    0,   54,    0,  398,
	    0,    3,    0,  399,    0
	};
}

private static final short _lexer_indicies[] = init__lexer_indicies_0();


private static short[] init__lexer_trans_targs_0()
{
	return new short [] {
	    0,    2,  308,   17,   17,   18,   28,   30,   44,   46,   49,   50,
	   62,   64,  110,  115,    3,   13,  100,    4,    5,    6,    7,    6,
	    7,    8,    7,   17,  267,  262,  281,  282,  288,  290,  303,    9,
	  263,   10,  260,   11,   12,   17,   17,   18,   28,   30,   44,   46,
	   49,   50,   62,   64,  110,  115,  258,   14,  106,   15,   16,  257,
	   17,   29,   16,   17,   29,   19,   20,   21,   22,   21,   21,   22,
	   21,   23,   23,   23,   24,   23,   23,   23,   24,   25,   26,   27,
	   17,   27,   28,   17,   29,   31,   32,   33,   34,   35,   36,   37,
	   38,   39,   40,   41,   42,   43,  310,   45,   47,   48,   17,   47,
	   46,   48,   44,   51,   52,  256,   53,   54,   55,   56,   57,   56,
	   57,   58,   57,   17,  218,  232,  233,  238,   59,   60,   61,    2,
	   63,   65,   80,   66,   67,   79,   68,   69,   70,   71,   72,   71,
	   72,   72,   17,   73,   74,   75,   78,   76,   77,   61,   81,   82,
	  159,   83,   84,   85,  158,   86,   87,   88,   89,   90,   91,   92,
	   93,   94,   93,   94,   95,   94,   17,  128,  123,  142,  143,  149,
	  151,  153,   96,  124,   97,  121,   98,   99,  108,  101,  102,  103,
	  104,  105,  107,  109,   61,  111,  112,  113,  114,  115,  116,  117,
	  119,  120,  118,  116,  117,  118,  116,  119,    2,  120,   18,   28,
	   30,   44,   46,   49,   50,   62,   64,  110,  115,  122,  123,  125,
	  126,  127,  129,  130,  131,  132,  133,  134,  135,  136,  137,  138,
	  139,  140,  141,   17,  144,  145,  148,  146,  147,  150,  152,  154,
	  155,  156,  157,  160,  161,  160,  161,  162,  161,   17,  178,  173,
	  192,  193,  198,  200,  213,  163,  165,  174,  164,   61,  166,  171,
	  167,  168,  169,  170,  172,  173,  175,  176,  177,  179,  180,  181,
	  182,  183,  184,  185,  186,  187,  188,  189,  190,  191,   17,  194,
	  195,  197,  196,  199,  201,  202,  203,  204,  205,  206,  212,  207,
	  208,  209,  210,  211,  214,  215,  216,  217,  219,  220,  221,  222,
	  223,  224,  225,  226,  227,  228,  229,  230,  231,   17,  234,  235,
	  237,  236,  239,  244,  240,  241,  243,  242,  245,  246,  247,  248,
	  249,  255,  250,  251,  252,  253,  254,  259,   61,  261,  262,  264,
	  265,  266,  268,  269,  270,  271,  272,  273,  274,  275,  276,  277,
	  278,  279,  280,   17,  283,  284,  287,  285,  286,  289,  291,  292,
	  293,  294,  295,  296,  302,  297,  298,  299,  300,  301,  304,  305,
	  306,  307,  309,    0
	};
}

private static final short _lexer_trans_targs[] = init__lexer_trans_targs_0();


private static short[] init__lexer_trans_actions_0()
{
	return new short [] {
	   43,   29,    0,    0,   54,    3,    1,    0,   29,    1,   29,   29,
	   29,   29,   29,   35,    0,    0,    0,    0,    0,   57,  144,    0,
	   54,   84,    0,   72,   33,   84,   84,   84,   84,   84,   84,    0,
	    0,    0,    0,   15,   63,   31,  130,   60,   57,   31,   63,   57,
	   63,   63,   63,   63,   63,   66,    0,    0,    0,    0,   57,   57,
	  149,  126,    0,  110,   23,    0,    0,    7,  139,   48,    0,  102,
	    9,    5,   45,  134,   45,    0,   33,  122,   33,   33,    0,   11,
	  106,    0,    0,  114,   25,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,   27,  118,   27,
	   51,    0,    0,    0,    0,    0,    0,    0,    0,   57,  144,    0,
	   54,   84,    0,   69,   33,   84,   84,   84,    0,    0,   13,   63,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,   57,  144,    0,
	   54,    0,   81,   84,    0,    0,    0,    0,    0,   21,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	   57,  144,    0,   54,   84,    0,   78,   33,   84,   84,   84,   84,
	   84,   84,    0,    0,    0,    0,   19,   63,    0,    0,    0,   57,
	    0,    0,    0,    0,   19,    0,    0,    0,   57,    0,    0,   37,
	   37,   54,   37,   87,    0,    0,   39,    0,   96,    0,   93,   90,
	   41,   96,   90,   96,   96,   96,   96,   96,   99,    0,    0,    0,
	   19,   63,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,   19,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,   19,    0,   57,  144,    0,   54,   84,    0,   75,   33,   84,
	   84,   84,   84,   84,   84,    0,    0,    0,    0,   17,    0,    0,
	   17,   63,    0,    0,    0,    0,    0,   17,   63,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,   17,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,   17,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,   13,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,   15,    0,    0,    0,
	   15,   63,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,   15,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	   15,    0,    0,    0
	};
}

private static final short _lexer_trans_actions[] = init__lexer_trans_actions_0();


private static short[] init__lexer_eof_actions_0()
{
	return new short [] {
	    0,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,
	   43,   43,   43,   43,   43,   43,   43,   43,   43,   43,   43
	};
}

private static final short _lexer_eof_actions[] = init__lexer_eof_actions_0();


static final int lexer_start = 1;
static final int lexer_first_final = 310;

static final int lexer_en_main = 1;


// line 159 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"

  public void scan(String source)  {
    String input = source + "\n%_FEATURE_END_%";
    byte[] data = null;
    try {
      data = input.getBytes("UTF-8");
    } catch(UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }
    int cs, p = 0, pe = data.length;
    int eof = pe;

    int lineNumber = 1;
    int lastNewline = 0;

    int contentStart = -1;
    int currentLine = -1;
    int docstringContentTypeStart = -1;
    int docstringContentTypeEnd = -1;
    int startCol = -1;
    int nextKeywordStart = -1;
    int keywordStart = -1;
    String keyword = null;
    List<String> currentRow = null;

    
// line 534 "java/src/main/java/gherkin/lexer/En_old.java"
	{
	cs = lexer_start;
	}

// line 185 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
    
// line 541 "java/src/main/java/gherkin/lexer/En_old.java"
	{
	int _klen;
	int _trans = 0;
	int _acts;
	int _nacts;
	int _keys;
	int _goto_targ = 0;

	_goto: while (true) {
	switch ( _goto_targ ) {
	case 0:
	if ( p == pe ) {
		_goto_targ = 4;
		continue _goto;
	}
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
case 1:
	_match: do {
	_keys = _lexer_key_offsets[cs];
	_trans = _lexer_index_offsets[cs];
	_klen = _lexer_single_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + _klen - 1;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + ((_upper-_lower) >> 1);
			if ( data[p] < _lexer_trans_keys[_mid] )
				_upper = _mid - 1;
			else if ( data[p] > _lexer_trans_keys[_mid] )
				_lower = _mid + 1;
			else {
				_trans += (_mid - _keys);
				break _match;
			}
		}
		_keys += _klen;
		_trans += _klen;
	}

	_klen = _lexer_range_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + (_klen<<1) - 2;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + (((_upper-_lower) >> 1) & ~1);
			if ( data[p] < _lexer_trans_keys[_mid] )
				_upper = _mid - 2;
			else if ( data[p] > _lexer_trans_keys[_mid+1] )
				_lower = _mid + 2;
			else {
				_trans += ((_mid - _keys)>>1);
				break _match;
			}
		}
		_trans += _klen;
	}
	} while (false);

	_trans = _lexer_indicies[_trans];
	cs = _lexer_trans_targs[_trans];

	if ( _lexer_trans_actions[_trans] != 0 ) {
		_acts = _lexer_trans_actions[_trans];
		_nacts = (int) _lexer_actions[_acts++];
		while ( _nacts-- > 0 )
	{
			switch ( _lexer_actions[_acts++] )
			{
	case 0:
// line 16 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      contentStart = p;
      currentLine = lineNumber;
      if(keyword != null) {
        startCol = p - lastNewline - (keyword.length() + 1);
      }
    }
	break;
	case 1:
// line 24 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      currentLine = lineNumber;
      startCol = p - lastNewline;
    }
	break;
	case 2:
// line 29 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      contentStart = p;
    }
	break;
	case 3:
// line 33 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      docstringContentTypeStart = p;
    }
	break;
	case 4:
// line 37 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      docstringContentTypeEnd = p;
    }
	break;
	case 5:
// line 41 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      String con = unindent(startCol, substring(data, contentStart, nextKeywordStart-1).replaceFirst("(\\r?\\n)?([\\t ])*\\Z", "").replace("\\\"\\\"\\\"", "\"\"\""));
      String conType = substring(data, docstringContentTypeStart, docstringContentTypeEnd).trim();
      listener.docString(conType, con, currentLine);
    }
	break;
	case 6:
// line 47 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      String[] nameDescription = nameAndUnindentedDescription(startCol, keywordContent(data, p, eof, nextKeywordStart, contentStart));
      listener.feature(keyword, nameDescription[0], nameDescription[1], currentLine);
      if(nextKeywordStart != -1) p = nextKeywordStart - 1;
      nextKeywordStart = -1;
    }
	break;
	case 7:
// line 54 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      String[] nameDescription = nameAndUnindentedDescription(startCol, keywordContent(data, p, eof, nextKeywordStart, contentStart));
      listener.background(keyword, nameDescription[0], nameDescription[1], currentLine);
      if(nextKeywordStart != -1) p = nextKeywordStart - 1;
      nextKeywordStart = -1;
    }
	break;
	case 8:
// line 61 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      String[] nameDescription = nameAndUnindentedDescription(startCol, keywordContent(data, p, eof, nextKeywordStart, contentStart));
      listener.scenario(keyword, nameDescription[0], nameDescription[1], currentLine);
      if(nextKeywordStart != -1) p = nextKeywordStart - 1;
      nextKeywordStart = -1;
    }
	break;
	case 9:
// line 68 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      String[] nameDescription = nameAndUnindentedDescription(startCol, keywordContent(data, p, eof, nextKeywordStart, contentStart));
      listener.scenarioOutline(keyword, nameDescription[0], nameDescription[1], currentLine);
      if(nextKeywordStart != -1) p = nextKeywordStart - 1;
      nextKeywordStart = -1;
    }
	break;
	case 10:
// line 75 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      String[] nameDescription = nameAndUnindentedDescription(startCol, keywordContent(data, p, eof, nextKeywordStart, contentStart));
      listener.examples(keyword, nameDescription[0], nameDescription[1], currentLine);
      if(nextKeywordStart != -1) p = nextKeywordStart - 1;
      nextKeywordStart = -1;
    }
	break;
	case 11:
// line 82 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      listener.step(keyword, substring(data, contentStart, p).trim(), currentLine);
    }
	break;
	case 12:
// line 86 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      listener.comment(substring(data, contentStart, p).trim(), lineNumber);
      keywordStart = -1;
    }
	break;
	case 13:
// line 91 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      listener.tag(substring(data, contentStart, p).trim(), currentLine);
      keywordStart = -1;
    }
	break;
	case 14:
// line 96 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      lineNumber++;
    }
	break;
	case 15:
// line 100 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      lastNewline = p + 1;
    }
	break;
	case 16:
// line 104 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      if(keywordStart == -1) keywordStart = p;
    }
	break;
	case 17:
// line 108 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      keyword = substring(data, keywordStart, p).replaceFirst(":$","");
      keywordStart = -1;
    }
	break;
	case 18:
// line 113 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      nextKeywordStart = p;
    }
	break;
	case 19:
// line 117 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      p = p - 1;
      currentRow = new ArrayList<String>();
      currentLine = lineNumber;
    }
	break;
	case 20:
// line 123 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      contentStart = p;
    }
	break;
	case 21:
// line 127 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      String con = substring(data, contentStart, p).trim();
      currentRow.add(con
        .replace("\\|", "|")
        .replace("\\n", "\n")
        .replace("\\\\", "\\")
      );
    }
	break;
	case 22:
// line 136 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      listener.row(currentRow, currentLine);
    }
	break;
	case 23:
// line 140 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      if(cs < lexer_first_final) {
        String content = currentLineContent(data, lastNewline);
        throw new LexingError("Lexing error on line " + lineNumber + ": '" + content + "'. See http://wiki.github.com/cucumber/gherkin/lexingerror for more information.");
      } else {
        listener.eof();
      }
    }
	break;
// line 802 "java/src/main/java/gherkin/lexer/En_old.java"
			}
		}
	}

case 2:
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
	if ( ++p != pe ) {
		_goto_targ = 1;
		continue _goto;
	}
case 4:
	if ( p == eof )
	{
	int __acts = _lexer_eof_actions[cs];
	int __nacts = (int) _lexer_actions[__acts++];
	while ( __nacts-- > 0 ) {
		switch ( _lexer_actions[__acts++] ) {
	case 23:
// line 140 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
	{
      if(cs < lexer_first_final) {
        String content = currentLineContent(data, lastNewline);
        throw new LexingError("Lexing error on line " + lineNumber + ": '" + content + "'. See http://wiki.github.com/cucumber/gherkin/lexingerror for more information.");
      } else {
        listener.eof();
      }
    }
	break;
// line 834 "java/src/main/java/gherkin/lexer/En_old.java"
		}
	}
	}

case 5:
	}
	break; }
	}

// line 186 "/Users/sean/code/gherkin/tasks/../ragel/i18n/en_old.java.rl"
  }

  private String keywordContent(byte[] data, int p, int eof, int nextKeywordStart, int contentStart) {
    int endPoint = (nextKeywordStart == -1 || (p == eof)) ? p : nextKeywordStart;
    return substring(data, contentStart, endPoint);
  }

  private String[] nameAndUnindentedDescription(int startCol, String text) {
    String[] lines = text.split("\n");
    String name = lines.length > 0 ? lines[0].trim() : "";
    StringBuffer description = new StringBuffer();
    for(int i = 1; i < lines.length; i++) {
      description.append(lines[i]);
      description.append("\n");
    }
    return new String[]{name, unindent(startCol+2, description.toString()).replaceAll("\\s+$", "")};
  }

  private String unindent(int startCol, String text) {
    return Pattern.compile("^[\t ]{0," + startCol + "}", Pattern.MULTILINE).matcher(text).replaceAll("");
  }

  private String currentLineContent(byte[] data, int lastNewline) {
    return substring(data, lastNewline, data.length).trim();
  }

  private String substring(byte[] data, int start, int end) {
    try {
      return new String(data, start, end-start, "utf-8");
    } catch(java.io.UnsupportedEncodingException e) {
      throw new RuntimeException("Internal error", e);
    }
  }
}
