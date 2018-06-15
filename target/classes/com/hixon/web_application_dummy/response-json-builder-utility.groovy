package com.hixon.web_application_dummy.objects.responses

import groovy.json.JsonOutput
import groovy.json.JsonSlurper


public def buildJson (LinkedHashMap meta, LinkedHashMap keyValues, LinkedHashMap attributes) {
    def output = [meta: [], data: []]
    if (meta != null) {
        meta.each {
            output.meta << it
        }
    }
    
    if (keyValues != null) {
        keyValues.each {
        output.data << it
        }
    }

     if (attributes != null) {
        attributes.each {
        output.data << it
        }
    }
   
   return JsonOutput.toJson(output)
}

public def buildJson (LinkedHashMap json) {
   return JsonOutput.toJson(json)
}

public def buildJson (String json) {
	return JsonSlurper().parseText(payload)
}