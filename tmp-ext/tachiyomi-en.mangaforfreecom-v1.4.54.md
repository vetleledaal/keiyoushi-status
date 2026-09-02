# Extension Validation Report

- Extension: tachiyomi-en.mangaforfreecom-v1.4.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1099222169691387069
- Source name: Mangaforfree.com
- Source language: en
- Selected manga input: latest offset 0: Regressed Warrior’s Female Dominance (`.../regressed-warriors-female-dominance`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | My Girlfriend Was Already Fully Trained (`.../my-girlfriend-was-already-fully-trained`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | I am the only Man soldier in the unit (`.../i-am-the-only-man-soldier-in-the-unit`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Regressed Warrior’s Female Dominance (`.../regressed-warriors-female-dominance`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Believe! I will offer You My first (`.../believe-i-will-offer-you-my-first-01`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Regressed Warrior’s Female Dominance (`.../regressed-warriors-female-dominance`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Regressed Warrior’s Female Dominance (`.../regressed-warriors-female-dominance`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 108 | Chapter 1 (`https://mangaforfree.com/.../chapter-1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Regressed Warrior’s Female Dominance, URL=`.../regressed-warriors-female-dominance` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangaforfree.com/.../Regressed-Warriors-Female-Dominance-manga-free-175x238.jpg` (image/jpeg, 13176 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../regressed-warriors-female-dominance` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangaforfree.com/.../Regressed-Warriors-Female-Dominance-manga-free-193x278.jpg` (image/jpeg, 16789 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Drama, Ecchi, Fantasy, Harem, Manhwa, Mature, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | I was swung around in my past life but this time I’ll live the way I want to. I’ll fuck all the beautiful women, my female domination starts now!<br><br>Alternative Names: 회귀병사의 암컷 정복일지! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 108 chapters |  |  |  |
| chapter dates | PASS | 108 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 108 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mangaforfree.com/.../1.jpg` (image/jpeg, 951404 bytes, 720x14866) |  |  |  |
