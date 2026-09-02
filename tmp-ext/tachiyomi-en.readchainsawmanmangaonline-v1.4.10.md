# Extension Validation Report

- Extension: tachiyomi-en.readchainsawmanmangaonline-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 22
- Lint: 4
- Warnings: 1
- Skipped: 8
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6207801235158968822
- Source name: Read Chainsaw Man Manga Online
- Source language: en
- Selected manga input: popular offset 0: Chainsaw Man (`https://ww6.readchainsawman.com/.../chainsaw-man`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | Chainsaw Man (`https://ww6.readchainsawman.com/.../chainsaw-man`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | Chainsaw Man (`https://ww6.readchainsawman.com/.../chainsaw-man`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Chainsaw Man (`https://ww6.readchainsawman.com/.../chainsaw-man`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 232 | Chainsaw Man Chapter 1 - Dog and Chainsaw (`https://ww6.readchainsawman.com/.../chainsaw-man-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 57 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Chainsaw Man, URL=`https://ww6.readchainsawman.com/.../chainsaw-man` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 2 manga entries: title=Light Novel, URL=`https://ww6.readchainsawman.com/.../chainsaw-man-buddy-stories`, title=Colored, URL=`https://ww6.readchainsawman.com/.../chainsaw-man-colored` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | LINT | 15/15 listing manga have titles and URLs; popular: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://ww6.readchainsawman.com/.../chainsaw-man`, popular entry 2: `https://ww6.readchainsawman.com/.../17-21-fujimoto-tatsuki-tanpenshuu`, popular entry 3: `https://ww6.readchainsawman.com/.../fire-punch` |  |  |  |
| thumbnail URLs | LINT | 0/15 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `https://ww6.readchainsawman.com/.../chainsaw-man` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../EOwoyN9.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | "I guess Devil Hunter's the best for making money," proclaims chronically broke Denji, a Devil Hunter-for-hire. With his trusty chainsaw and chainsaw...dog, Denji vies to make it to his next meal; however, nothing is ever as it seems, and things never go as planned. Madness begins with the story of a dark hero who will rock the world. A new era of devils, hunters, and chainsaws begins! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 232 chapters |  |  |  |
| chapter dates | LINT | All 232 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=232 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 232 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 57 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.readchainsawman.com/.../chain_1_0.1.jpg` (image/jpeg, 112774 bytes, 1500x2250) |  |  |  |
