export class Excuse {

    tag: string;
    message: string;
    http_code: string;


    constructor(tag: string, message: string, http_code: string) {
        this.tag = tag;
        this.message = message;
        this.http_code = http_code;
    }
}