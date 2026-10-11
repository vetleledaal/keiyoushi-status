# Extension Validation Report

- Extension: tachiyomi-all.namicomi-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 6815287454679474132
- Source name: NamiComi
- Source language: en
- Selected manga input: popular offset 0: Falling in Love With My Ex-Fiance's Grandfather (`.../73hLs8EN`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Falling in Love With My Ex-Fiance's Grandfather (`.../73hLs8EN`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Frostpunk - Child Labour (`.../wRmha7t6`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Personality Hire (`.../WRhrzREz`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | The Glass Lady (`.../S2K8HQYa`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Falling in Love With My Ex-Fiance's Grandfather (`.../73hLs8EN`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Falling in Love With My Ex-Fiance's Grandfather (`.../73hLs8EN`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 156 | Ch.1 (`.../86NSVCqw`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 27 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Falling in Love With My Ex-Fiance's Grandfather, URL=`73hLs8EN` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://uploads.namicomi.com/.../cdf10a2a-ad19-4ce8-bdf5-b7bba9930aa2.png` (image/png, 4581523 bytes, 2000x2800) |  |  |  |
| details identity | PASS | Details preserved selected URL `73hLs8EN` |  |  |  |
| details thumbnail URL | PASS | `https://uploads.namicomi.com/.../cdf10a2a-ad19-4ce8-bdf5-b7bba9930aa2.png` |  |  |  |
| details author | PASS | Hanza Art |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Full Color, Comedy, Romance, English |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | \[Age Gap - Comedy\] Lady Mary Menoushire was a 20 year-old who just got rejected by her fiance. After passing out from a broken heart, her body got possessed by a 50-year old woman from another world... who thinks her (now ex) fiance's grandfather is hotter.<br><br>Disclaimer: this series started as a joke on Twitter, to make fun of Isekai with absurd name and insane age gap. <br><br>(Long title: Waking up in another world as a Lady and Falling in Love with My Ex-Fiance's Grandfather) <br><br>----updates Mon/Thurs---- |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 156 chapters |  |  |  |
| chapter dates | PASS | 156 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://uploads.namicomi.com/.../1-71d32e381595485622520e64f206ebf806f8b9dc5d7c94ee743a8a9cd37cee42.jpg` (image/jpeg, 28602 bytes, 800x500) |  |  |  |
