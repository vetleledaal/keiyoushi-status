# Extension Validation Report

- Extension: tachiyomi-es.doujinshell-v1.4.53
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 7008709488397053596
- Source name: DoujinsHell
- Source language: es
- Selected manga input: latest offset 0: ME ENAMORÉ DE MI DESAFORTUNADA MADRE Y LA DEJÉ EMBARAZADA (`.../me-enamore-de-mi-desafortunada-madre-y-la-deje-embarazada`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | ESCUELA EN CASA 1 (`.../escuela-en-casa-1`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 12 | MADRE SOLTERA – ESTRATEGIAS ECONOMICAS PARA MI HOGAR AOKI-SAN (`.../madre-soltera-estrategias-economicas-para-mi-hogar-aoki-san`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | ME ENAMORÉ DE MI DESAFORTUNADA MADRE Y LA DEJÉ EMBARAZADA (`.../me-enamore-de-mi-desafortunada-madre-y-la-deje-embarazada`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | ÉL ES MI AMIGO SEXUAL (`.../el-es-mi-amigo-sexual`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ME ENAMORÉ DE MI DESAFORTUNADA MADRE Y LA DEJÉ EMBARAZADA (`.../me-enamore-de-mi-desafortunada-madre-y-la-deje-embarazada`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ME ENAMORÉ DE MI DESAFORTUNADA MADRE Y LA DEJÉ EMBARAZADA (`.../me-enamore-de-mi-desafortunada-madre-y-la-deje-embarazada`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo (`https://doujinshell.net/.../me-enamore-de-mi-desafortunada-madre-y-la-deje-embarazada <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 37 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ME ENAMORÉ DE MI DESAFORTUNADA MADRE Y LA DEJÉ EMBARAZADA, URL=`.../me-enamore-de-mi-desafortunada-madre-y-la-deje-embarazada` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://doujinshell.net/.../29-2-110x150.jpg` (image/jpeg, 7220 bytes, 110x150) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../me-enamore-de-mi-desafortunada-madre-y-la-deje-embarazada` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://doujinshell.net/.../29-2-193x278.jpg` (image/jpeg, 18068 bytes, 193x278) |  |  |  |
| details author | PASS | Pipasuta |  |  |  |
| details artist | PASS | Pipasuta |  |  |  |
| details genres | PASS | Ahegao, Big Ass, Embarazadas, Full Color, Incesto, Maduras, Masturbation, Milfs, Nakadashi, Ninfomanas, Oral, Paizuri, Sumisas, Tetonas, Vanilla |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | <br><br>SOLO DENLE CLICK A LA IMAGEN PARA DESCARGAR EL DOUJIN<br><br>Nombres Alternativos: ME ENAMORÉ DE MI DESAFORTUNADA MADRE Y LA DEJÉ EMBARAZADA - OTOKOUN NAI HAHAOYA NI KOI O SHITE NINSHINSASETE #17076 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 1 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s10.imagenimage.com/.../taqzdkqxuu71.jpg` (image/jpeg, 165715 bytes, 566x800) |  |  |  |
