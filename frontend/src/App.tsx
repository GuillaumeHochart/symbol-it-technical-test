import React from 'react';
import './App.css';
import {Background} from "./component/Background";
import {SocialNetwork} from "./component/publicity/SocialNetwork";
import {Title} from "./component/title/Title";
import {Viewer,SpecialZoomLevel} from "@react-pdf-viewer/core";
import '@react-pdf-viewer/default-layout/lib/styles/index.css';
import {Separator} from "./component/Separator";
import {SymbolButton} from "./component/SymbolButton";
import classNames from "classnames";
import {Solution} from "./component/solution/Solution";

function App() {

    return (
        <Background className="App">
            <header className="App-header">
                <Title/>
                <div style={{background:'#fff',width:'100%'}}>
                    <h4 style={{color:'rgb(194,194,194)'}}>Problématique & Objectif</h4>
                    <div style={{height:'860px'}}>
                        <Viewer fileUrl="exercise.pdf" defaultScale={SpecialZoomLevel.ActualSize}/>
                    </div>
                    <h4 style={{color:'rgb(194,194,194)'}}>Solution</h4>
                    <Solution />
                </div>
                <SocialNetwork/>
            </header>
        </Background>
    );
}

export default App;
