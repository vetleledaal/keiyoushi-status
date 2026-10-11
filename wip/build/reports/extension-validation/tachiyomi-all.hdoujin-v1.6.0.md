# Extension Validation Report

- Extension: tachiyomi-all.hdoujin-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 3677056573528884471
- Source name: HDoujin
- Source language: en
- Selected manga input: popular offset 0: [Bad Mushrooms (Chicke III, 4why)] 1/5 no Renai Kanjou (Gotoubun no Hanayome) [English] [Digital] [Sample] (`.../f80ff5318f79`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 80 | [Bad Mushrooms (Chicke III, 4why)] 1/5 no Renai Kanjou (Gotoubun no Hanayome) [English] [Digital] [Sample] (`.../f80ff5318f79`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 80 | [GOD Ryokutya (Bu-chan)] Yokkyuu Fuman ga Tamatte Hoka no Otoko no Chinpo Case ni Natteshimatta Oku-san [English] [biribiri] (`.../455e31dd3e89`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 80 | [Kamejirouya-san (Kametaro)] Taihai Tsuma 2 Taihaikei Hitozuma o Yachin Kawari ni Koki Tsukaeru Hanashi (Horrible MTL) / Desparate Scans (`.../aa3977e30566`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 80 | [NENIGE] Onabare Shita Gal Mama wa Yokkyuu Fuman de Hatsujouchuu | Caught Masturbating, the Frustrated Gal Wife In Heat [English] [Penguin Piper] (`.../cb6adebacb73`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [Bad Mushrooms (Chicke III, 4why)] 1/5 no Renai Kanjou (Gotoubun no Hanayome) [English] [Digital] [Sample] (`.../f80ff5318f79`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Bad Mushrooms (Chicke III, 4why)] 1/5 no Renai Kanjou (Gotoubun no Hanayome) [English] [Digital] [Sample] (`.../f80ff5318f79`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../f80ff5318f79`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.io.IOException: Open webview to refresh token | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.io.IOException: Open webview to refresh token | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 80 entries |  |  |  |
| latest listing | PASS | 80 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Bad Mushrooms (Chicke III, 4why)\] 1/5 no Renai Kanjou (Gotoubun no Hanayome) \[English\] \[Digital\] \[Sample\], URL=`21950/f80ff5318f79` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=\[NENIGE\] Onabare Shita Gal Mama wa Yokkyuu Fuman de Hatsujouchuu \| Caught Masturbating, the Frustrated Gal Wife In Heat \[English\] \[Penguin Piper\], URL=`235534/cb6adebacb73` at page 1 offset 79 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 321/321 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 321/321 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://erocdn.net/.../eebdfa7d-020b-4efd-81dd-0f8dca03a4b2.webp` (image/webp (encoding: lossy), 29784 bytes, 250x352) |  |  |  |
| details identity | PASS | Details preserved selected URL `21950/f80ff5318f79` |  |  |  |
| details thumbnail URL | PASS | `https://erocdn.net/.../eebdfa7d-020b-4efd-81dd-0f8dca03a4b2.webp` |  |  |  |
| details author | PASS | Bad Mushrooms |  |  |  |
| details artist | PASS | 4why, Chicke Iii |  |  |  |
| details genres | PASS | 4why, Chicke Iii, Bad Mushrooms, Gotoubun No Hanayome, Fuutarou Uesugi, Ichika Nakano, Nino Nakano, Anal ♀, Blowjob ♀, Garter Belt ♀, Lingerie ♀, Nakadashi ♀, Pantyhose ♀, Pixie Cut ♀, Shimaidon ♀, Stockings ♀, Swimsuit ♀, Condom ♂, Sole Male ♂, Ffm Threesome, Group, Compilation, Rough Translation, Sample |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Circles: Bad Mushrooms<br>Uploaders: Affectionate-Ad-7651<br>Parodies: Gotoubun No Hanayome<br>Characters: Fuutarou Uesugi, Ichika Nakano, Nino Nakano<br><br>Posted: Monday, 30 Dec 2024 18:03 (CET)<br>Pages: 118<br><br>Alternative Title(s): <br>- \[壞茸社 (Chicke III、4why)\] 1/5の恋愛感情 (五等分の花嫁) \[英訳\] \[DL版\] \[見本\], <br>- 1/5の恋愛感情<br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Open webview to refresh token |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
