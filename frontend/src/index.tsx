import React from 'react';
import { render } from 'react-dom';
import './index.css';
import App from './App';
import {Worker} from '@react-pdf-viewer/core';
import 'font-awesome/css/font-awesome.min.css';


const rootElement = document.getElementById('root');
render(
    <Worker workerUrl="https://unpkg.com/pdfjs-dist@2.6.347/build/pdf.worker.js">
        <App />
    </Worker>,
    rootElement
);