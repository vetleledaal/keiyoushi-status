# Extension Validation Report

- Extension: tachiyomi-en.toonily-v1.4.68
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
- Source ID: 5190569675461947007
- Source name: Toonily
- Source language: en
- Selected manga input: latest offset 0: Scumbag (`.../scumbag-0abc9bc9`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | A Wonderful New World (`.../a-wonderful-new-world-96b3391d`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 18 | A Pervert’s Daily Life (`.../a-perverts-daily-life-1af7f0f8`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 18 | Scumbag (`.../scumbag-0abc9bc9`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | I Became an Apartment Security Manager (`.../i-became-an-apartment-security-manager-4b5fb22a`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Scumbag (`.../scumbag-0abc9bc9`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Scumbag (`.../scumbag-0abc9bc9`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 17 | Chapter 1 (`https://toonily.com/.../chapter-1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Scumbag, URL=`.../scumbag-0abc9bc9` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 74/74 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 74/74 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.tnlycdn.com/.../Scumbag-manhwa-for-free-350x476.jpg` (image/jpeg, 99161 bytes, 640x896) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../scumbag-0abc9bc9` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://static.tnlycdn.com/.../Scumbag-manhwa-for-free-224x320.jpg` (image/jpeg, 99161 bytes, 640x896) |  |  |  |
| details author | PASS | Kim Se-ran |  |  |  |
| details artist | PASS | Lee Dong Heon, Soso |  |  |  |
| details genres | PASS | Drama, Seinen, Mature |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dohyun was always awkward when it came to women. He wanted to be smooth with them, just like his friend Jiwon. However, the belated awakening of his lust starts to disrupt his everyday life. “Oppa… I didn’t know you were like this. You’re such a pervert…”<br><br>Scumbag (also known as 인간실격) is an ongoing Korean drama manhwa , written by Kim Se-ran and illustrated by Lee Dong Heon, Soso, published by Toptoon.<br><br>It is also commonly searched as “Scumbag manga”, even though it follows the Korean manhwa/webtoon format. Readers who want to read Scumbag online in English can explore this series for its engaging plot, character-driven storytelling, and distinctive artwork.<br><br>Whether you search for Scumbag manhwa or Scumbag manga, it offers a strong reading experience within the drama genre.<br><br>Alternative Names: 인간실격 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | PASS | 17 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 17 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://data.tnlycdn.com/.../01-xbnvqrqhb4lk32ozpcwdwvzf.jpg` (image/jpeg, 1175830 bytes, 720x16530) |  |  |  |
