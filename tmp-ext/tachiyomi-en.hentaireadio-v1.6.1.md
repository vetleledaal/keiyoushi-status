# Extension Validation Report

- Extension: tachiyomi-en.hentaireadio-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1055804712296309124
- Source name: HentaiRead.io
- Source language: en
- Selected manga input: popular offset 0: My Mother (`.../my-mother-16820`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 37 | My Mother (`.../my-mother-16820`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 37 | Going Wild With Stepmom (Uncensored) (`.../going-wild-with-stepmom-uncensored-57510`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 37 | The Female Delinquent Set Her Eyes On Me (`.../the-female-delinquent-set-her-eyes-on-me-52616`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 37 | Request Itadaita Mono desu | Per Request - Mary Aki (`.../request-itadaita-mono-desu-per-request-mary-aki-59213`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 37 | Haha ga Keiei Shiteiru no wa Isekai Yuri Sakaba nano ka!? | My Mother Runs An Isekai World Lezzy Tavern!? (`.../haha-ga-keiei-shiteiru-no-wa-isekai-yuri-sakaba-nano-ka33;-my-mother-runs-an-isekai-world-lezzy-tavern33;-58823`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | My Mother (`.../my-mother-16820`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | Chapter 1 (`.../chapter-1-82423`) |  | <1s |
| pages | `getPageList(chapter)` | success | 65 |  |  | 1-10s |

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
| popular listing | PASS | 37 entries |  |  |  |
| latest listing | PASS | 37 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 37 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 1 manga entry: title=My Mother, URL=`.../my-mother-16820`; Popular page 2 repeats 1 manga entry: title=Going Wild With Stepmom (Uncensored), URL=`.../going-wild-with-stepmom-uncensored-57510`; Latest page 1 repeats 1 manga entry: title=The Female Delinquent Set Her Eyes On Me, URL=`.../the-female-delinquent-set-her-eyes-on-me-52616`; Latest page 2 repeats 1 manga entry: title=Request Itadaita Mono desu \| Per Request - Mary Aki, URL=`.../request-itadaita-mono-desu-per-request-mary-aki-59213` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 185/185 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 185/185 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentairead.io/.../1709118316-65df136cec489-thumb62651fe80530f.webp` (image/webp (encoding: lossy), 68532 bytes, 704x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../my-mother-16820` |  |  |  |
| details thumbnail URL | PASS | `https://hentairead.io/.../1709118316-65df136cec489-thumb62651fe80530f.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Hentai |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 65 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ht.mgread.io/.../pic_001.jpg` (image/jpeg, 582823 bytes, 1007x1500) |  |  |  |
