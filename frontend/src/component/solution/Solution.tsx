import classNames from "classnames";
import {SymbolButton} from "../SymbolButton";
import {ModalDiv} from "../ModalDiv";
import React, {useEffect, useState} from "react";
import './Solution.css'
import {getExcuses} from "../../http/messagesClient";
import startup from "../../images/startup.svg"
import {useModal} from "../UseModal";
import ModalContent from "../optionnal/ModalContent";
import {Excuse} from "../../model/Excuse";
import {CircularProgress} from "@material-ui/core";
import {backGroundColor} from "../../css/color";
import {timeout} from "../../util/util";

export function Solution() {

    const [phrases, setPhrases] = useState<Excuse[]>([]);
    const [random, setRandom] = useState("********************");
    const {isShowing, toggle} = useModal();
    const [loading, setLoading] = useState(false);


    useEffect(() => {
        getExcuses().then(response => {
            setPhrases(response);
        })
    }, []);

    function rand(min: number, max: number): number {
        return min + Math.floor(Math.random() * (max - min));
    }

    async function setRandomPhrase() {
        setLoading(true)
        await timeout(rand(1, 5) * 1000);
        setLoading(false)
        setRandom(phrases[rand(0, phrases.length - 1)].message)
    }

    return <div className={classNames('flex', 'flex-column', 'symbol-solution-div')} style={{marginBottom: "10%"}} id="solution">
        <div><h6 style={{color: 'rgb(194,194,194)'}}>Ma super solution</h6>
            <img
                className={classNames({'img-super': loading})}
                src={startup}/>
        </div>

        <div className={classNames('flex', 'flex-row')} style={{justifyContent: "center"}}>
             <i className="fa fa-random" style={{color: "black", marginBottom: 'auto', marginTop: 'auto', marginRight: '10px'}}/>
            <p style={{color: '#2a3b4e', fontSize: '18px'}}>{random}</p>
        </div>
        <div>
            <SymbolButton className={classNames({'inactive':loading})} color="#006eb3" onClick={() => setRandomPhrase()}>Random</SymbolButton>
            <SymbolButton color="hsl(206,100%,52%)" onClick={() => toggle()}>Ajouter</SymbolButton>
            <ModalDiv content={<ModalContent setPhrases={setPhrases} hide={toggle}/>} isShowing={isShowing}
                      hide={toggle}/>
        </div>
    </div>
}