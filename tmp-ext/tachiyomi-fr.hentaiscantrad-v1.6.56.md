# Extension Validation Report

- Extension: tachiyomi-fr.hentaiscantrad-v1.6.56
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 6747208512135394944
- Source name: Hentai-Scantrad
- Source language: fr
- Selected manga input: popular offset 0: Secret Class (`.../4478`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Secret Class (`.../4478`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | MOBY DICK (`.../26216`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Asmodeck : Jeu du Désir (`.../27594`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Je vais commencer par ta mère (`.../26452`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 8 | Secret Class (`.../4478`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class (`.../4478`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 312 | Ch.1 (`.../ch-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 22 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`4478` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 108/108 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 108/108 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentai-scantrad.org/.../hentai-hd-4478-afe6c727613b-thumb.webp` (image/webp (encoding: lossy), 11866 bytes, 180x252) |  |  |  |
| details identity | PASS | Details preserved selected URL `4478` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentai-scantrad.org/.../hentai-hd-4478-afe6c727613b-master.webp` (image/webp (encoding: lossy), 216272 bytes, 1280x1792) |  |  |  |
| details author | PASS | Wang Kang Cheol |  |  |  |
| details artist | PASS | Mina-chan |  |  |  |
| details genres | PASS | Adulte, Harem, Romance, Seinen, Webtoons |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dae Ho, qui est devenu orphelin à l’âge de 13 ans, a été adopté par l’ami de son père. Cependant, à l’âge adulte, Dae Ho ne savait rien des relations entre hommes et femmes. La tante et les soeurs ont décidé de donner à Dae Ho pur une classe secrète<br><br><br><br>Alternative Names: 비밀수업秘密教學, 비밀수업, 秘密教學 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 312 chapters |  |  |  |
| chapter dates | PASS | 312 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `http://stockage.hentai-scantrad.org/.../1.jpg` to `https://stockage.hentai-scantrad.org/.../1.jpg` (1 redirects) |  |  |  |
| page load | PASS | `http://stockage.hentai-scantrad.org/.../1.jpg` (image/jpeg, 121866 bytes, 858x1000) |  |  |  |
