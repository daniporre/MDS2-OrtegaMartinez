import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-vercuentausuarioregistrado`
 *
 * VistaVercuentausuarioregistrado element.
 *
 * @customElement
 * @polymer
 */
class VistaVercuentausuarioregistrado extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-vercuentausuarioregistrado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVercuentausuarioregistrado.is, VistaVercuentausuarioregistrado);
