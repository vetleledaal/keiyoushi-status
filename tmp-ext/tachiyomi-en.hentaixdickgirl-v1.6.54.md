# Extension Validation Report

- Extension: tachiyomi-en.hentaixdickgirl-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 918523496924275699
- Source name: HentaiXDickgirl
- Source language: en
- Selected manga input: popular offset 0: Anya to Yor (Spy x Family) (`.../1317`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Anya to Yor (Spy x Family) (`.../1317`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Tsuiteru (`.../965`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Everyone’s Elf Sensei (`.../5572`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Junsei yori Ai o Komete (`.../5567`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Anya to Yor (Spy x Family) (`.../1317`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Anya to Yor (Spy x Family) (`.../1317`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Oneshot (`.../oneshot`) |  | <1s |
| pages | `getPageList(chapter)` | success | 7 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Anya to Yor (Spy x Family), URL=`1317` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaixdickgirl.com/.../anya-to-yor-hentai-spy-x-family-175x238.jpg` (image/jpeg, 12641 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1317` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaixdickgirl.com/.../anya-to-yor-hentai-spy-x-family.jpg` (image/jpeg, 54508 bytes, 300x431) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | G: Futanari, T: Doujinshi, Ahegao, Big Breasts, Big Penis, Collar, Daughter, Gloves, Hair Buns, Incest, Inseki, Lolicon, Mother, Pasties, Smalldom, Sole Dickgirl, Sole Female, Spy x Family, Stockings, Twintails, Unusual Pupils |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Alternative Names: Anya and Yor |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://hentaixdickgirl.com/.../Pg_1.webp` (image/webp (encoding: lossy), 91798 bytes, 835x1200) |  |  |  |
