# Extension Validation Report

- Extension: tachiyomi-es.spnmanga-v1.6.1
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
- Source ID: 8680653475935544022
- Source name: SpnManga
- Source language: es
- Selected manga input: popular offset 0: El Demonio Celestial del Espacio 3077 (`.../el-demonio-celestial-del-espacio-3077`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | El Demonio Celestial del Espacio 3077 (`.../el-demonio-celestial-del-espacio-3077`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 32 | Después de dejar de actuar como un perro, me convertí en un Magnate Celestial Urbano (`.../despues-de-dejar-de-actuar-como-un-perro-me-converti-en-un-magnate-celestial-urbano`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 32 | Sekai Saikyou no Majo, Hajimemashita: Watashi Dake "Kouryaku Site" o Miseru Sekai de Jiyuu ni Ikimasu (`.../sekai-saikyou-no-majo-hajimemashita-watashi-dake-kouryaku-site-o-miseru-sekai-de-jiyuu-ni-ikimasu`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 32 | Boruto - Two Blue Vortex (`.../boruto-two-blue-vortex`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | El Demonio Celestial del Espacio 3077 (`.../el-demonio-celestial-del-espacio-3077`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | El Demonio Celestial del Espacio 3077 (`.../el-demonio-celestial-del-espacio-3077`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 110 | Capitulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 67 |  |  | <1s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 32 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=El Demonio Celestial del Espacio 3077, URL=`.../el-demonio-celestial-del-espacio-3077` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 129/129 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 129/129 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.spnmanga.com/.../ef1353d68283b7cafed84b273dcced.jpg <redacted query values: v1794341263775>` (image/jpeg, 39903 bytes, 200x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../el-demonio-celestial-del-espacio-3077` |  |  |  |
| details thumbnail URL | PASS | `https://www.spnmanga.com/.../ef1353d68283b7cafed84b273dcced.jpg <redacted query values: v1794341263775>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Drama, Fantasia, Artes Marciales, Aventura |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Cuando pasaron muchos años y el demonio celestial, que había sido sellado en Taesan, abrió los ojos, la humanidad ya había abandonado la Tierra impregnada de radiación y estaba surcando la galaxia.<br><br>**Alternative Names:**<br>- Space cheon-ma 3077 Cheon-Hyang Han Pyromaniac Executioner<br>- Space Heavenly Horse 3077 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 110 chapters |  |  |  |
| chapter dates | PASS | 110 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 67 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://es1s11-95168.t34798ndc.com/.../TU.2ce.jpg` (image/jpeg, 353676 bytes, 1778x1000) |  |  |  |
