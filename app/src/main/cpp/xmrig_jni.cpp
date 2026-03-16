#include <jni.h>
#include <string>
#include "xmrig/api/Client.h"
#include "xmrig/core/Config.h"

extern "C" JNIEXPORT void JNICALL
Java_com_lottttoy_XMRigBridge_startMining(JNIEnv *env, jobject instance, jstring poolUrl_, jstring wallet_) {
    const char *poolUrl = env->GetStringUTFChars(poolUrl_, nullptr);
    const char *wallet = env->GetStringUTFChars(wallet_, nullptr);

    xmrig::Config config;
    config.setAlgorithm("randomx");
    config.setPools({{poolUrl, wallet}});
    xmrig::Client::run(config);

    env->ReleaseStringUTFChars(poolUrl_, poolUrl);
    env->ReleaseStringUTFChars(wallet_, wallet);
}
