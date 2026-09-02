# Extension Validation Report

- Extension: tachiyomi-en.mangahen-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 33
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6602595408477221375
- Source name: Gensura
- Source language: en
- Selected manga input: latest offset 0: Shouta-kun-chi no Chijo Dragon (`.../shouta-kun-chi-no-chijo-dragon`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 42 | Giri no Oyako ga Doukyou Shitereba Kitto kou (`.../giri-no-oyako-ga-doukyou-shitereba-kitto-kou`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 42 | Shinobi no Musume wa Ijiritai Zakari 2 (`.../shinobi-no-musume-wa-ijiritai-zakari-2`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 42 | Shouta-kun-chi no Chijo Dragon (`.../shouta-kun-chi-no-chijo-dragon`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 42 | B-trayal 52 kanojo (`.../b-trayal-52-kanojo`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Shouta-kun-chi no Chijo Dragon (`.../shouta-kun-chi-no-chijo-dragon`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../shouta-kun-chi-no-chijo-dragon`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 26 |  |  | 1-10s |

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
| popular listing | PASS | 42 entries |  |  |  |
| latest listing | PASS | 42 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 168/168 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 168/168 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gensura.net/.../thumbnail.webp` (image/webp (encoding: lossy), 33562 bytes, 352x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../shouta-kun-chi-no-chijo-dragon` |  |  |  |
| details thumbnail URL | PASS | `https://gensura.net/.../thumbnail.webp` |  |  |  |
| details author | PASS | Maidoll |  |  |  |
| details artist | PASS | Fei |  |  |  |
| details genres | PASS | Big Ass, Big Breasts, Big Penis, Blowjob, Crossdressing, Femdom, Fisting, Horns, Hotpants, Huge Breasts, MILF, Monster Girl, Nakadashi, Paizuri, Shotacon, Sole Female, Sole Male, Stockings, Sweating, Tall Girl, Virginity |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Categories: Doujinshi<br>Parodies: Kobayashi-san Chi no Maid Dragon<br>Circles: Maidoll<br><br>Pages: 26<br>Views: 0<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://gensura.net/.../61c136f17670f03772a5.webp` (image/webp (encoding: lossy), 174384 bytes, 1055x1500) |  |  |  |
