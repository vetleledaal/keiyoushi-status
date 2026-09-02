# Extension Validation Report

- Extension: tachiyomi-en.cutiecomics-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7821715230468497947
- Source name: Cutie Comics
- Source language: en
- Selected manga input: popular offset 0: THE SUCCUBUS HOUSEWIFE NEXT DOOR. | TONARI NO HEYA NO INMA TSUMA. (`.../22616-the-succubus-housewife-next-door-tonari-no-heya-no-inma-tsuma.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | THE SUCCUBUS HOUSEWIFE NEXT DOOR. | TONARI NO HEYA NO INMA TSUMA. (`.../22616-the-succubus-housewife-next-door-tonari-no-heya-no-inma-tsuma.html`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | THE TIME MY FRIEND TURNED ME INTO HIS GIRL LOVER AND PLAYTHING | ORE O ONNA NI SHITA YUUJIN NI NYOTAIKA SHITA KARADA O SUKIKATTE SARERU (`.../22596-the-time-my-friend-turned-me-into-his-girl-lover-and-plaything-ore-o-onna-ni-shita-yuujin-ni-nyotaika-shita-karada-o-sukikatte-sareru.html`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | THE SUCCUBUS HOUSEWIFE NEXT DOOR. | TONARI NO HEYA NO INMA TSUMA. (`.../22616-the-succubus-housewife-next-door-tonari-no-heya-no-inma-tsuma.html`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | THE SUCCUBUS HOUSEWIFE NEXT DOOR. | TONARI NO HEYA NO INMA TSUMA. (`.../22616-the-succubus-housewife-next-door-tonari-no-heya-no-inma-tsuma.html`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../22616-the-succubus-housewife-next-door-tonari-no-heya-no-inma-tsuma.html`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 27 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=THE SUCCUBUS HOUSEWIFE NEXT DOOR. \| TONARI NO HEYA NO INMA TSUMA., URL=`.../22616-the-succubus-housewife-next-door-tonari-no-heya-no-inma-tsuma.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cutiecomics.com/.../1788289341_1.webp` (image/webp (encoding: lossy), 17632 bytes, 290x409) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../22616-the-succubus-housewife-next-door-tonari-no-heya-no-inma-tsuma.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cutiecomics.com/.../1788289400_1.jpg` (image/jpeg, 136633 bytes, 900x1272) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ahegao, Big Areolae, Big Ass, Big Breasts, Blowjob, Huge Breasts, Impregnation, Inverted Nipples, Kissing, Nakadashi, Sole Female, Sole Male, Stockings, Twintails, X-Ray |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cutiecomics.com/.../1788289400_1.jpg` (image/jpeg, 136633 bytes, 900x1272) |  |  |  |
