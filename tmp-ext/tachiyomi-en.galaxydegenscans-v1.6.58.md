# Extension Validation Report

- Extension: tachiyomi-en.galaxydegenscans-v1.6.58
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4598626990187882152
- Source name: GalaxyDegenScans
- Source language: en
- Selected manga input: popular offset 0: Reincarnated • The Hero Marries the Sage (`.../528`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Reincarnated • The Hero Marries the Sage (`.../528`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Danshi dato Omotteita Osanajimi tono Shinkon Seikatsu ga Umaku Ikisugiru ken ni Tsuite (`.../666`) |  | 10s+ |
| latest | `getLatestUpdates(1)` | success | 25 | The Strongest Sage with 0 Magic Power (`.../981`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | I’m in charge of monsters (Spanish) (`.../968`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Reincarnated • The Hero Marries the Sage (`.../528`) |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Reincarnated • The Hero Marries the Sage (`.../528`) |  | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 44 | Ch.4.1 - Magic Academy's entrance exam (`.../ch-4-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Reincarnated • The Hero Marries the Sage, URL=`528` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gdscans.com/.../cover-1-175x238.jpeg` (image/jpeg, 17397 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `528` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://gdscans.com/.../cover-1-193x278.jpeg` (image/jpeg, 21647 bytes, 193x278) |  |  |  |
| details author | PASS | Fujiki Washiro |  |  |  |
| details artist | PASS | Nishi Riku |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Fantasy, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Reid, a young hero with the strongest physical strength, and Elria, a beautiful sage with the strongest magic prowess.<br><br>They continued to fight as rivals in opposing enemy nations, but their relationship came to an end with the sudden death of Elria… Then, a thousand years later,<br><br>Reincarnated in a world where magic reigns supreme, but he who has retained the strongest physical strength from his previous life, Reid, was reunited with Elria, who has also been reincarnated ――<br><br>“Hey, Reid ―― I want you to marry me.”<br><br>“……Huh?”<br><br>The two, who have become the strongest unaware lovey-dovey couple in a thousand years, enrolled in the Royal Magic Academy to decide who is stronger!<br><br>Alternative Names: Eiyuu to Kenja no Tensei Kon, Reincarnated • The Hero Marries the Sage ~After Becoming Engaged to a Former Rival, We Became the Strongest Couple~, The Hero and the Sage, Reincarnated and Engaged |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 44 chapters |  |  |  |
| chapter dates | LINT | 7 of 44 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=7 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://gdscans.com/.../000.webp` (image/webp (container: extended), 893506 bytes, 1000x700) |  |  |  |
