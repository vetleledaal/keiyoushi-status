# Extension Validation Report

- Extension: tachiyomi-en.readjujutsukaisenmangaonline-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 23
- Lint: 4
- Warnings: 1
- Skipped: 8
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 808850989053853006
- Source name: Read Jujutsu Kaisen Manga Online
- Source language: en
- Selected manga input: popular offset 0: Jujutsu Kaisen (`https://ww6.readjujutsukaisen.com/.../jujutsu-kaisen`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 8 | Jujutsu Kaisen (`https://ww6.readjujutsukaisen.com/.../jujutsu-kaisen`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Jujutsu Kaisen (`https://ww6.readjujutsukaisen.com/.../jujutsu-kaisen`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Jujutsu Kaisen (`https://ww6.readjujutsukaisen.com/.../jujutsu-kaisen`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 282 | Jujutsu Kaisen Chapter 0.1 - Jujutsu Kaisen Volume 0 Chapter 1 (`https://ww6.readjujutsukaisen.com/.../jujutsu-kaisen-chapter-0.1`) |  | <1s |
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
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jujutsu Kaisen, URL=`https://ww6.readjujutsukaisen.com/.../jujutsu-kaisen` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 10/10 listing manga have titles and URLs; popular: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://ww6.readjujutsukaisen.com/.../jujutsu-kaisen`, popular entry 2: `https://ww6.readjujutsukaisen.com/.../jujutsu-kaisen-0`, popular entry 3: `https://ww6.readjujutsukaisen.com/.../jujutsu-kaisen-colored` |  |  |  |
| thumbnail URLs | LINT | 0/10 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `https://ww6.readjujutsukaisen.com/.../jujutsu-kaisen` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../AHz5hzf.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | This is official version of Jujutsu Kaisen manga due to mistranslation of official version by "John Werry",you can read fan scan release here : Jujutsu Kaisen Fan scan We do add Volume version too, which is safe to read. Yuuji is a genius at track and field. But he has zero interest running around in circles, he's happy as a clam in the Occult Research Club. Although he's only in the club for kicks, things get serious when a real spirit shows up at school! Life's about to get really strange in Sugisawa Town #3 High School! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 282 chapters |  |  |  |
| chapter dates | LINT | All 282 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=282 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 282 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 57 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.readjujutsukaisen.com/.../2.jpeg` (image/jpeg, 281914 bytes, 1067x1600) |  |  |  |
