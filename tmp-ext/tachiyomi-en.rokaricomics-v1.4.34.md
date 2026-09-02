# Extension Validation Report

- Extension: tachiyomi-en.rokaricomics-v1.4.34
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 830150807344972132
- Source name: RokariComics
- Source language: en
- Selected manga input: popular offset 0: Wanna Go Grocery Shopping Together? (`.../wanna-shop-together`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Wanna Go Grocery Shopping Together? (`.../wanna-shop-together`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | A Secretly Capable Child Is Seeking For Her Dad (`.../a-secretly-capable-child-is-seeking-for-her-dad`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | This Retired Saintess Will Raise Your Property Value (`.../this-retired-saintess-will-raise-your-property-value`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Wanna Go Grocery Shopping Together? (`.../wanna-shop-together`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Wanna Go Grocery Shopping Together? (`.../wanna-shop-together`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 30 | Chapter 1 (`.../wanna-shop-together-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 7 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Wanna Go Grocery Shopping Together?, URL=`.../wanna-shop-together` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rokaricomics.com/.../thumbnail_IMAG21_36cb9a75-db0a-4eb4-8886-7beaa4dd01ec.webp` (image/webp (encoding: lossy), 34280 bytes, 439x571) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../wanna-shop-together` |  |  |  |
| details thumbnail URL | PASS | `https://rokaricomics.com/.../thumbnail_IMAG21_36cb9a75-db0a-4eb4-8886-7beaa4dd01ec.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Romance, Slice of life, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “Yangeun”, a seasoned solo dweller with maxed-out life skills who exclusively targets near-expired goods, and “Wooseok”, a minimalist who calculates every aspect of life based on pure efficiency. Ever since the day they split a buy-one-get-one-free pack of strawberries, their romance… Wait, no—their grocery shopping has begun!<br><br>Alternative Names: 같이 장볼래? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 30 chapters |  |  |  |
| chapter dates | PASS | 30 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://rokaricomics.com/.../e3db66eb42c810af3d88a776f14ab471.jpg` (image/jpeg, 1677912 bytes, 800x8700) |  |  |  |
