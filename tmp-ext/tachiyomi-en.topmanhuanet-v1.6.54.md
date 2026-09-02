# Extension Validation Report

- Extension: tachiyomi-en.topmanhuanet-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 33
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6421630287504544593
- Source name: TopManhua.net
- Source language: en
- Selected manga input: popular offset 0: The Return of the Crazy Demon (`.../3718`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | The Return of the Crazy Demon (`.../3718`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Heavenly Inquisition Sword (`.../3702`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | The Shepherd Wizard (`.../4678`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | The Heavenly Demon Wants a Quiet Life (`.../3726`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 7 | The Return of the Crazy Demon (`.../3718`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Return of the Crazy Demon (`.../3718`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 193 | Chapter 1 (`.../chapter-1`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Return of the Crazy Demon, URL=`3718` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 107/107 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 107/107 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://topmanhua.net/.../1be5e62f.webp` did not contain a decodable image (1599444 bytes) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `3718` |  |  |  |
| details thumbnail URL | PASS | `https://topmanhua.net/.../1be5e62f.webp` |  |  |  |
| details author | PASS | Jinseong Yu |  |  |  |
| details artist | PASS | Hi Lee |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Demon, Martial Arts, Returner |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Yi Zaha. The crazy demon crazy for martial arts.While he was running away after stealing the heavenly pearl of the Demon Cult Leader, he fell off a cliff.After thinking that everything was over, he opened his eyes to see that he had returned back to when he was a waiter…And he is being beat up for something that he didn’t do.The crazy demon who returned to the beginning of his days as a waiter!Will he go crazy again, or will he drive his enemies crazy?<br><br>Alternative Names: The Return of the Crazy Demon |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 193 chapters |  |  |  |
| chapter dates | LINT | 157 of 193 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=157 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://cdn.topmanhua.net/.../01-optimized.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 526 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
