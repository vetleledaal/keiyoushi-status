# Extension Validation Report

- Extension: tachiyomi-es.dynasty-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1788469981763672104
- Source name: Dynasty
- Source language: es
- Selected manga input: latest offset 0: Cuando los protagonistas se separaron (`.../274%7Ccuando-los-protagonistas-se-separaron`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Alfa Insignificante (`.../308%7Calfa-insignificante`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | La sacerdotisa de Dahallen (`.../409%7Cla-sacerdotisa-de-dahallen`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 18 | Cuando los protagonistas se separaron (`.../274%7Ccuando-los-protagonistas-se-separaron`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Antología NTR (`.../451%7Cantologia-ntr`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Cuando los protagonistas se separaron (`.../274%7Ccuando-los-protagonistas-se-separaron`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Cuando los protagonistas se separaron (`.../274%7Ccuando-los-protagonistas-se-separaron`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 37 | Capítulo 1 (`.../134997`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cuando los protagonistas se separaron, URL=`274\|cuando-los-protagonistas-se-separaron` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 77/77 listing manga have titles and URLs; 77 pipe-containing URLs skipped from classification |  |  |  |
| thumbnail URLs | PASS | 77/77 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.manhuako.net/.../cover-1784982240113.webp` (image/webp (encoding: lossy), 59194 bytes, 384x549) |  |  |  |
| details identity | PASS | Details preserved selected URL `274\|cuando-los-protagonistas-se-separaron` |  |  |  |
| details thumbnail URL | PASS | `https://img.manhuako.net/.../cover-1784982240113.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Soy Belita, la supuesta villana de una novela de romance fantástico.<br><br>Reencarné en un personaje cuyo destino está sellado: caer de la forma más miserable después de acosar al protagonista masculino y atormentar a la protagonista femenina.<br><br>Si quería salir adelante, solo había una solución: romper mi compromiso con el protagonista antes de que comenzara la historia y abandonar la ciudad.<br><br>Tras una planificación meticulosa, lo conseguí. Logré anular el compromiso y, como compensación, obtuve nada menos que una mina de diamantes.<br><br>...De verdad creí que había escapado de mi destino.<br><br>Pero entonces todo empezó a torcerse.<br><br>El protagonista y la protagonista terminaron separándose.<br>El protagonista masculino —que se suponía que me odiaba— me confesó su amor.<br>La protagonista femenina me idolatra como si fuera su protectora.<br>El hombre que originalmente estaba destinado a eliminarme ahora coquetea conmigo.<br>Y para colmo, incluso un personaje que ni siquiera existía en la obra original dice que arriesgaría su vida por mí.<br><br>Entonces... ¿por qué, en medio de este desastre donde la trama original se ha desmoronado por completo, los únicos acontecimientos que siguen ocurriendo exactamente igual son los que me llevan al final?<br><br>En esta historia que ya no se parece en nada a la original...<br>¿Seré capaz de salir adelante? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 37 chapters |  |  |  |
| chapter dates | PASS | 37 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.manhuako.net/.../001.webp` (image/webp (encoding: lossy), 24692 bytes, 1280x800) |  |  |  |
