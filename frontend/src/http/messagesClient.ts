import {config} from "../util/configuration";
import {Excuse} from "../model/Excuse";
import {stringify} from "querystring";

export async function getExcuses(){
  return await fetch(`${config.url.API_URL}/excuses`, {
    method: "GET",
  })
    .then(response => response.json())
    .then(response => {
      return response
    });
}

export async function addExcuse(excuse : Excuse){
  if(excuse == null ) return Promise.reject("excuse is null")
  if(excuse.tag == null) return Promise.reject("excuse.tag is null")
  if(excuse.message == null) return Promise.reject("message is null")
  if(excuse.http_code == null) return Promise.reject("excuse.http_code is null")


  return await fetch(`${config.url.API_URL}/excuses`, {
    method: "POST",
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body:JSON.stringify(excuse)
  })
    .then(response => response.json())
    .then(response => {
      return response
    });
}