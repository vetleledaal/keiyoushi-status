# Extension Validation Report

- Extension: tachiyomi-en.toonily-v1.4.68
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 5190569675461947007
- Source name: Toonily
- Source language: en
- Selected manga input: latest offset 0: Capitalist Harem (`.../capitalist-harem-e044db01`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | A Wonderful New World (`.../a-wonderful-new-world-96b3391d`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 18 | A Pervert’s Daily Life (`.../a-perverts-daily-life-1af7f0f8`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 18 | Capitalist Harem (`.../capitalist-harem-e044db01`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | Flesh and Money (`.../flesh-and-money-e3fdd25c`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Capitalist Harem (`.../capitalist-harem-e044db01`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Capitalist Harem (`.../capitalist-harem-e044db01`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 11 | Chapter 1 (`https://toonily.com/.../chapter-1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Capitalist Harem, URL=`.../capitalist-harem-e044db01` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.tnlycdn.com/.../Capitalist-Harem-Toptoon-Manhwa-350x476.jpg` (image/jpeg, 58143 bytes, 500x700) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../capitalist-harem-e044db01` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://static.tnlycdn.com/.../Capitalist-Harem-Toptoon-Manhwa-224x320.jpg` (image/jpeg, 58143 bytes, 500x700) |  |  |  |
| details author | PASS | Seupseuphukhuk |  |  |  |
| details artist | PASS | Sungmin |  |  |  |
| details genres | PASS | Drama, Romance, Mature |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Cheolsu was a crypto investor who had hit rock bottom. Left with nothing but despair, a fateful encounter with one woman turned his entire life upside down. But the more wealth they gathered, the closer they came to a choice from which neither of them could turn back…<br><br>Capitalist Harem (also known as 자본주의 하렘) is an ongoing Korean romance manhwa , written by Seupseuphukhuk and illustrated by Sungmin, published by Toptoon.<br><br>It is also commonly searched as “Capitalist Harem manga”, even though it follows the Korean manhwa/webtoon format. Readers who want to read Capitalist Harem online in English can explore this series for its engaging plot, character-driven storytelling, and distinctive artwork.<br><br>Whether you search for Capitalist Harem manhwa or Capitalist Harem manga, it offers a strong reading experience within the romance genre.<br><br>Alternative Names: 자본주의 하렘 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | PASS | 11 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 11 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://data.tnlycdn.com/.../01-hq8e35w3yaurfayyptrii58s.jpg` (image/jpeg, 1259250 bytes, 720x15664) |  |  |  |
