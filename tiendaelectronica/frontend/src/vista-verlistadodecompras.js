import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-verlistadodecompras`
 *
 * VistaVerlistadodecompras element.
 *
 * @customElement
 * @polymer
 */
class VistaVerlistadodecompras extends PolymerElement {

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
        return 'vista-verlistadodecompras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerlistadodecompras.is, VistaVerlistadodecompras);
