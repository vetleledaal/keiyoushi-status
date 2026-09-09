# Extension Validation Report

- Extension: tachiyomi-es.dragontranslationorg-v1.4.54
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 4647982373411241498
- Source name: DragonTranslation.org
- Source language: es
- Selected manga input: latest offset 0: Manipulación Financiera (`.../manipulacion-financiera`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | Deja de fumar (`.../deja-de-fumar`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 12 | No Quiero A La Hija, Si No A Su Madre (`.../no-quiero-a-la-hija-si-no-a-su-madre`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Manipulación Financiera (`.../manipulacion-financiera`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | NICOTINEKO (`.../p8mgfxvybiag4qh`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Manipulación Financiera (`.../manipulacion-financiera`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Manipulación Financiera (`.../manipulacion-financiera`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 33 | Capitulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 76 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Manipulación Financiera, URL=`.../manipulacion-financiera` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | FAIL | Malformed manga URLs: latest_next entry 6: `.../el-regreso-del-ha%C2%89roe-de-clase-desastre-2` contains control characters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dragontranslation.org/.../fqIEeg.jpg` (image/jpeg, 39353 bytes, 500x700) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manipulacion-financiera` |  |  |  |
| details thumbnail URL | PASS | `https://dragontranslation.org/.../fqIEeg.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | +18, Ecchi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | En el gélido eco de una acusación que amenazaba con despojarlo de su última pizca de dignidad, Manjae, el alma incansable de Yeocho Company, se vio arrojado al abismo de la humillación. Cada gota de sudor, cada esfuerzo silencioso, solo le había valido el desprecio y el más bajo escalafón. Pero cuando las risas condescendientes de sus compañeras se clavaron como dagas en su espíritu, una chispa oscura, una sed de revancha, encendió su mirada. Fue entonces cuando el destino, con un guiño perverso, le tendió una mano en la oscuridad: una oportunidad de inversión secreta, un sendero prohibido hacia el poder. Desde ese instante, el juego de su vida se transformó. La existencia, antes un tormento gris, se tiñó de un vibrante y peligroso matiz, donde cada movimiento financiero era una nota en la sinfonía de su ascenso. ¿Podrá este peón olvidado convertirse en el rey de un tablero donde las reglas del amor, la venganza y la ambición se entrelazan de forma inesperada? Sumérgete en este torbellino de emociones y descubre el precio de la manipulación. No esperes más, el primer capítulo te aguarda para desvelar el inicio de esta apasionante odisea. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 33 chapters |  |  |  |
| chapter dates | PASS | 33 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 76 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://dragontranslation.org/.../001.jpg` (image/jpeg, 234154 bytes, 720x3333) |  |  |  |
