# Extension Validation Report

- Extension: tachiyomi-fr.aniverse-v1.6.4
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
- Source ID: 4821794959228633650
- Source name: Aniverse
- Source language: fr
- Selected manga input: popular offset 0: Chainsaw Man (`.../chainsaw-man`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Chainsaw Man (`.../chainsaw-man`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Kagurabachi (`.../kagurabachi`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 28 | The Road to You (`.../the-road-to-you`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 28 | Legendary Youngest Son of The Marquis House (`.../legendary-youngest-son-of-the-marquis-house`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Chainsaw Man (`.../chainsaw-man`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Chainsaw Man (`.../chainsaw-man`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 231 | Chapitre 1 (`.../56f9e3ca-e8f5-49fc-8116-da885090eaf3`) |  | <1s |
| pages | `getPageList(chapter)` | success | 55 |  |  | <1s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 28 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Chainsaw Man, URL=`chainsaw-man` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 138/138 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 138/138 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.onefy.me/.../poster-9f036e2e.png` (image/png, 609084 bytes, 460x722) |  |  |  |
| details identity | PASS | Details preserved selected URL `chainsaw-man` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.onefy.me/.../poster-9f036e2e.png` |  |  |  |
| details author | PASS | Tatsuki Fujimoto |  |  |  |
| details artist | PASS | Tatsuki Fujimoto |  |  |  |
| details genres | PASS | Action, Comedy, Drama, Horror, Supernatural |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Le titre dit tout ! La vie de misère de Denji change à jamais lorsqu'il fusionne avec son chien tronçonneuse, Pochita ! Il vit désormais dans la grande ville et est un Devil Hunter officiel. Mais il a encore beaucoup à apprendre sur son nouveau métier et ses pouvoirs de tronçonneuse !<br><br>(Source : MANGA Plus)<br><br><i>Notes :<br>- Nominé pour le prix Manga Taisho 2020.<br>- Lauréat du prix Kono Manga ga Sugoi 2021.<br>- Lauréat du 66e prix Shogakukan Manga dans la catégorie shounen.<br>- Lauréat du prix Harvey du meilleur manga en 2021 et 2022.<br>- Les chapitres 1 à 97 ont été publiés dans le Weekly Shounen Jump du 3 décembre 2018 au 13 décembre 2020. La série a repris à partir du chapitre 98 dans le Shounen Jump+ le 12 juillet 2022<.../i%3E |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 231 chapters |  |  |  |
| chapter dates | PASS | 231 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.onefy.me/.../001.jpg` (image/jpeg, 356332 bytes, 959x1400) |  |  |  |
