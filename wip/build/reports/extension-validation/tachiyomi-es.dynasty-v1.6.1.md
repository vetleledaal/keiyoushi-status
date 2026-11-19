# Extension Validation Report

- Extension: tachiyomi-es.dynasty-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1788469981763672104
- Source name: Dynasty
- Source language: es
- Selected manga input: latest offset 0: Bienvenidos a Howoldang (`.../420%7Cbienvenidos-a-howoldang`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 17 | El Pintor de Mazmorras (`.../389%7Cel-pintor-de-mazmorras`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Selección mutua (`.../332%7Cseleccion-mutua`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 17 | Bienvenidos a Howoldang (`.../420%7Cbienvenidos-a-howoldang`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Me convertí en la cuñada de los protagonistas masculinos del harem inverso arruinado (`.../379%7Cme-converti-en-la-cunada-de-los-protagonistas-masculinos-del-harem-inverso-arruinado`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Bienvenidos a Howoldang (`.../420%7Cbienvenidos-a-howoldang`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Bienvenidos a Howoldang (`.../420%7Cbienvenidos-a-howoldang`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 17 | Capítulo 1 (`.../142167`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | 1-10s |

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
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | PASS | 17 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Bienvenidos a Howoldang, URL=`420\|bienvenidos-a-howoldang` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 75/75 listing manga have titles and URLs; 75 pipe-containing URLs skipped from classification |  |  |  |
| thumbnail URLs | PASS | 75/75 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.manhuako.net/.../cover-1786454424598.webp` (image/webp (encoding: lossy), 25524 bytes, 315x415) |  |  |  |
| details identity | PASS | Details preserved selected URL `420\|bienvenidos-a-howoldang` |  |  |  |
| details thumbnail URL | PASS | `https://img.manhuako.net/.../cover-1786454424598.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Haeil y Hyeon crecieron juntos en un orfanato, como si fueran hermanos.<br>Sin embargo, un día Hyeon comienza a sufrir un extraño deseo de abalanzarse sobre Haeil cada noche y, curiosamente, al llegar la mañana no recuerda absolutamente nada de lo ocurrido.<br><br>Para descubrir la causa, Haeil visita a Sawol, una chamana gumiho que lleva viviendo 300 años.<br>En cuanto Sawol ve a Haeil, se da cuenta de que él es un «shingamul», alguien capaz de aliviar su maldición...<br><br>«Yo te daré lo que necesitas, así que tú dame lo que yo quiero.» |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | PASS | 17 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.manhuako.net/.../001.webp` (image/webp (encoding: lossy), 2099540 bytes, 720x15000) |  |  |  |
