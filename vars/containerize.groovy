#!/usr/bin/env groovy

def call(String imageId) {
	withEnv(
		["IMAGE_ID+"+imageId]
	){
		sh '''
			docker build -t ${IMAGE_ID}
		'''
	}
}
