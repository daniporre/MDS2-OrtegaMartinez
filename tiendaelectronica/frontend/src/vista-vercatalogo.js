import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-vercatalogo`
 *
 * VistaVercatalogo element.
 *
 * @customElement
 * @polymer
 */
class VistaVercatalogo extends PolymerElement {

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
        return 'vista-vercatalogo';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVercatalogo.is, VistaVercatalogo);
