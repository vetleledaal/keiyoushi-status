# Extension Validation Report

- Extension: tachiyomi-en.readsololevelingmangamanhwaonline-v1.4.11
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 22
- Lint: 4
- Warnings: 2
- Skipped: 8
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1374366734159205648
- Source name: Read Solo Leveling Manga Manhwa Online
- Source language: en
- Selected manga input: popular offset 0: Solo Leveling Manhwa (`https://ww4.readsololeveling.org/.../solo-leveling`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 4 | Solo Leveling Manhwa (`https://ww4.readsololeveling.org/.../solo-leveling`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Solo Leveling Manhwa (`https://ww4.readsololeveling.org/.../solo-leveling`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Solo Leveling (`https://ww4.readsololeveling.org/.../solo-leveling`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 202 | Solo Leveling Chapter 1 (`https://ww4.readsololeveling.org/.../solo-leveling-chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 21 |  |  | <1s |

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
| popular listing | PASS | 4 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Solo Leveling Manhwa, URL=`https://ww4.readsololeveling.org/.../solo-leveling` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 5/5 listing manga have titles and URLs; popular: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://ww4.readsololeveling.org/.../solo-leveling`, popular entry 2: `https://ww4.readsololeveling.org/.../solo-leveling-light-novel`, popular entry 3: `https://ww4.readsololeveling.org/.../solo-leveling-ragnarok` |  |  |  |
| thumbnail URLs | LINT | 0/5 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | UNUSUAL | Details changed selected title Solo Leveling Manhwa to Solo Leveling |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../leTtc1A.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Solo Leveling (나 혼자만 레벨업, Na Honjaman Lebel-eob) is a story about the weakest hunter Sung Jin-Woo and his quest to become the strongest, S-Rank hunter. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 202 chapters |  |  |  |
| chapter dates | LINT | All 202 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=202 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 202 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.readsololeveling.org/.../SL_1_002.jpg` (image/jpeg, 675983 bytes, 720x4000) |  |  |  |
