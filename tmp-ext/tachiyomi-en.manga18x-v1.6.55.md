# Extension Validation Report

- Extension: tachiyomi-en.manga18x-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6802623574377987877
- Source name: Manga 18x
- Source language: en
- Selected manga input: popular offset 0: What’s wrong with this family? (`.../4976`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | What’s wrong with this family? (`.../4976`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Addicted to My Stepmom (`.../4850`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | It’s A Lie, But It’s Okay (`.../6644`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | The Female Delinquent Set Her Eyes On Me! (`.../6518`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | What’s wrong with this family? (`.../4976`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | What’s wrong with this family? (`.../4976`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 110 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=What’s wrong with this family?, URL=`4976` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga18x.net/.../Whats-wrong-with-this-family-175x238.jpg` (image/jpeg, 9676 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `4976` |  |  |  |
| details thumbnail URL | PASS | `https://manga18x.net/.../Whats-wrong-with-this-family-175x238.jpg` |  |  |  |
| details author | PASS | Kowoo |  |  |  |
| details artist | PASS | Crow |  |  |  |
| details genres | PASS | Adult, Drama, Harem, Manhwa, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Han Cheolyeon lives in the household of a mother and her two daughters. Believing he’s hated by everyone, he quietly prepares to leave. But in reality, all three family members only wish to have sex with him… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 110 chapters |  |  |  |
| chapter dates | LINT | 71 of 110 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=71 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `http://manhwaclub.net/.../1.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
