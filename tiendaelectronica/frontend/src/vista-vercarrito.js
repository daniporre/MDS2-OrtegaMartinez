import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-vercarrito`
 *
 * VistaVercarrito element.
 *
 * @customElement
 * @polymer
 */
class VistaVercarrito extends PolymerElement {

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
        return 'vista-vercarrito';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVercarrito.is, VistaVercarrito);
