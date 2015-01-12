//
//  EjectoidActivity.m
//  Ejectoid
//
//  Created by Dario Segura on 2015-01-11.
//  Copyright (c) 2015 Trompo Games Inc. All rights reserved.
//

#include <jni.h>
#import <Foundation/Foundation.h>
#include <stdio.h>

void Java_com_trompogames_Ejectoid_EjectoidActivity_run( JNIEnv* env, jobject thiz )
{
    printf("hello from printf");
    NSLog(@"hello from NSLog"); 
}
