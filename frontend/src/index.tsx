import React from 'react';
import {render} from 'react-dom';
import './index.css';
import App from './App';
import {Worker} from '@react-pdf-viewer/core';
import 'font-awesome/css/font-awesome.min.css';
import {BrowserRouter, Route, Routes} from "react-router-dom";
import LostRouter from "./router/LostRouter";
import {Home} from "./component/view/Home";


const rootElement = document.getElementById('root');
render(
    <Worker workerUrl="https://unpkg.com/pdfjs-dist@2.6.347/build/pdf.worker.js">
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<App/>}>
                    <Route index element={<Home />} />
                    <Route path="lost" element={<LostRouter/>}/>
                </Route>
            </Routes>
        </BrowserRouter>
    </Worker>,
    rootElement
);