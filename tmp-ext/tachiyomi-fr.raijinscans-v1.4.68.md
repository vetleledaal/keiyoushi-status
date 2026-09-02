# Extension Validation Report

- Extension: tachiyomi-fr.raijinscans-v1.4.68
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 27
- Lint: 1
- Warnings: 0
- Skipped: 6
- Failed: 2
- Retry disposition: RETRY_WHEN
- Retry condition: HARNESS_REVISION_CHANGES: java.lang.NoSuchMethodError

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8373267671495516033
- Source name: Raijin Scans
- Source language: fr
- Selected manga input: latest offset 0: Full-Time Awakening (`.../full-time-awakening`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 48 | Tales Of Demons And Gods (`.../tales-of-demons-and-gods-084175`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 21 | Full-Time Awakening (`.../full-time-awakening`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 14 | Vas-y, ose. (`.../vas-y-ose`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Full-Time Awakening (`.../full-time-awakening`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Full-Time Awakening (`.../full-time-awakening`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 106 | Chapitre 1 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.lang.NoSuchMethodError: 'void android.webkit.WebSettings.setBlockNetworkLoads(boolean)' | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.NoSuchMethodError: 'void android.webkit.WebSettings.setBlockNetworkLoads(boolean)' | RETRY_WHEN | HARNESS_COMPATIBILITY_FAILURE | HARNESS_REVISION_CHANGES: java.lang.NoSuchMethodError |
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 21 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Full-Time Awakening, URL=`.../full-time-awakening` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 24 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 84/84 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 84/84 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://raijin-scans.fr/.../34f199db-630c-428d-883c-a29cb57aca36-280x400.jpg` (image/jpeg, 36830 bytes, 280x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../full-time-awakening` |  |  |  |
| details thumbnail URL | PASS | `https://raijin-scans.fr/.../34f199db-630c-428d-883c-a29cb57aca36-280x400.jpg` |  |  |  |
| details author | PASS | TONY |  |  |  |
| details artist | PASS | TONY |  |  |  |
| details genres | PASS | Action, Fantastique |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | En tant que capitaine de la Légion divine et plus puissant Éveillé, Bai Yi est trahi par un camarade et voit tous ses coéquipiers mourir sous ses yeux. C’est alors seulement qu’il réalise qu’il n’a toujours été qu’un pion entre les mains des puissants. Ayant tout perdu, il renaît 20 ans plus tôt, à l’époque où il était encore au collège, avant son éveil. À cette époque, sa famille et ses coéquipiers sont encore en vie. Pour les sauver, venger le traître et renverser tout le système corrompu au pouvoir, il s’engage dans un chemin solitaire vers la puissance. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 106 chapters |  |  |  |
| chapter dates | LINT | 1 of 106 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | 'void android.webkit.WebSettings.setBlockNetworkLoads(boolean)' |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
