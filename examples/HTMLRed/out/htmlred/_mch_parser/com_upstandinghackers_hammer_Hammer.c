/* generated from model null*/
/* generated by template mchparser.com_upstandinghackers_hammer_Hammer*/


#include "jhammer.h"
#include "internal.h"
#include "com_upstandinghackers_hammer_Hammer.h"
#include <stdlib.h>

static JavaVM* jvm;

HParsedToken* callAction(const HParseResult *p, const char* name)
{
    JNIEnv *env;
    jint rs = (*jvm)->GetEnv(jvm, (void**) &env, JNI_VERSION_1_6);
    assert (rs == JNI_OK);
    rs = (*jvm)->AttachCurrentThread(jvm, (void**) &env, NULL);
    assert (rs == JNI_OK);

    jclass actionsClass;
    FIND_CLASS(actionsClass, env, "htmlred/_mch_parser/HTMLRedActions");
   
    jmethodID mid = (*env)->GetStaticMethodID(env, actionsClass, name, "(Lcom/upstandinghackers/hammer/ParseResult;)Lcom/upstandinghackers/hammer/ParsedToken;");
    if (mid == 0)
    {
	return NULL;
    }

    jclass argumentClass;
    FIND_CLASS(argumentClass, env, "com/upstandinghackers/hammer/ParseResult");
    assert(argumentClass != NULL);
    jmethodID constructor = REFCONSTRUCTOR_(env, argumentClass);
    assert(constructor != NULL);
    jobject parseResult = (*env)->NewObject(env, argumentClass, constructor, (jlong)p);

    jobject parsedToken = (*env)->CallStaticObjectMethod(env, actionsClass, mid, parseResult);
    assert(parsedToken != NULL);
    
    return (HParsedToken *)((*env)->GetLongField(env, parsedToken, (*env)->GetFieldID(env, FIND_CLASS_(env, "com/upstandinghackers/hammer/ParsedToken"), "inner", "J")));
}

HParsedToken* act_Undefined(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actUndefined");
}

HParsedToken* act_P(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actP");
}
HParsedToken* act_Alternatives(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actAlternatives");
}
HParsedToken* act_B(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actB");
}
HParsedToken* act_I(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actI");
}

HParsedToken* act_TT_1(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actTT_1");
}
HParsedToken* act_TT_2(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actTT_2");
}
HParsedToken* act_TT_3(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actTT_3");
}
HParsedToken* act_TT_4(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actTT_4");
}
HParsedToken* act_TT_5(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actTT_5");
}
HParsedToken* act_TT_6(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actTT_6");
}
HParsedToken* act_TEXTB(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actTEXTB");
}

JNIEXPORT jobject JNICALL Java_com_upstandinghackers_hammer_Hammer_action
  (JNIEnv *env, jclass class, jobject p, jstring a)
{
	//RETURNWRAP(env, h_middle(UNWRAP(env, p), UNWRAP(env, x), UNWRAP(env, q)));

	jint rs = (*env)->GetJavaVM(env, &jvm);
	assert (rs == JNI_OK);

	const char *actionName = (*env)->GetStringUTFChars(env, a, 0);

    if( strcmp(actionName,"actUndefined") == 0 )
	{
		RETURNWRAP( env, h_action(UNWRAP(env, p), act_Undefined, NULL) );
	}
	else if( strcmp(actionName,"actP") == 0 )
	{
		RETURNWRAP( env, h_action(UNWRAP(env, p), act_P, NULL) );
	}
	else if( strcmp(actionName,"actAlternatives") == 0 )
	{
		RETURNWRAP( env, h_action(UNWRAP(env, p), act_Alternatives, NULL) );
	}
	else if( strcmp(actionName,"actB") == 0 )
	{
		RETURNWRAP( env, h_action(UNWRAP(env, p), act_B, NULL) );
	}
	else if( strcmp(actionName,"actI") == 0 )
	{
		RETURNWRAP( env, h_action(UNWRAP(env, p), act_I, NULL) );
	}
	else if( strcmp(actionName,"actTT_1") == 0 )
	{
		RETURNWRAP( env, h_action(UNWRAP(env, p), act_TT_1, NULL) );
	}
	else if( strcmp(actionName,"actTT_2") == 0 )
	{
		RETURNWRAP( env, h_action(UNWRAP(env, p), act_TT_2, NULL) );
	}
	else if( strcmp(actionName,"actTT_3") == 0 )
	{
		RETURNWRAP( env, h_action(UNWRAP(env, p), act_TT_3, NULL) );
	}
	else if( strcmp(actionName,"actTT_4") == 0 )
	{
		RETURNWRAP( env, h_action(UNWRAP(env, p), act_TT_4, NULL) );
	}
	else if( strcmp(actionName,"actTT_5") == 0 )
	{
		RETURNWRAP( env, h_action(UNWRAP(env, p), act_TT_5, NULL) );
	}
	else if( strcmp(actionName,"actTT_6") == 0 )
	{
		RETURNWRAP( env, h_action(UNWRAP(env, p), act_TT_6, NULL) );
	}
	else if( strcmp(actionName,"actTEXTB") == 0 )
	{
		RETURNWRAP( env, h_action(UNWRAP(env, p), act_TEXTB, NULL) );
	}
	
	else return p;
}