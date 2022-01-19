import classNames from "classnames";
import {SymbolButton} from "../SymbolButton";
import React, {useEffect, useState} from "react";
import './Solution.css'
import {getExcuses} from "../../http/messagesClient";
import startup from "../../images/startup.svg"

export interface IPhrase {
    http_code: string;
    message: string;
    tag: string;
}

export function Solution() {

    const [phrases, setPhrases] = useState<IPhrase[]>([]);
    const [random,setRandom] = useState("********************");

    useEffect(() => {
        getExcuses().then(response => {
            setPhrases(response);
        })
    }, []);

    function setRandomPhrase(){
        const min = 0;
        const max = phrases.length-1;
        const rand = min + Math.floor(Math.random() * (max - min));
        setRandom(phrases[rand].message)
    }

    return <div className={classNames('flex', 'flex-column', 'symbol-solution-div')}>
        <div><h6 style={{color: 'rgb(194,194,194)'}}>Ma super solution</h6><img src={startup}/></div>

        <div className={classNames('flex','flex-row')} style={{justifyContent:"center"}}>
            <i className="fa fa-random" style={{color: "black",marginBottom:'auto',marginTop:'auto',marginRight:'10px'}}/>
            <p style={{color:'#2a3b4e',fontSize:'18px'}}>{random}</p>
        </div>
        <SymbolButton onClick={()=>setRandomPhrase()}>Bouton</SymbolButton>
    </div>
}