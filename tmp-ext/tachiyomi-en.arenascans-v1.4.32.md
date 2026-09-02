# Extension Validation Report

- Extension: tachiyomi-en.arenascans-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8861274191478178487
- Source name: Arena Scans
- Source language: en
- Selected manga input: popular offset 0: How to Get My Husband on My Side (`.../how-to-get-my-husband-on-my-side`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | How to Get My Husband on My Side (`.../how-to-get-my-husband-on-my-side`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Return of the First Patriarch: The Strongest Reincarnates into His Descendant 1000 Years Later (`.../return-of-the-first-patriarch-the-strongest-reincarnates-into-his-descendant-1000-years-later`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Time Turned Back, So I’ll Choose a Different Life (`.../time-turned-back-so-i-ll-choose-a-different-life`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | To the Witch Who Forgot the Birds (`.../to-the-witch-who-forgot-the-birds`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | As a Reincarnated Villainess and a Single Mother, I’ve Secured the Love Route! (`.../as-a-reincarnated-villainess-and-a-single-mother-ive-secured-the-love-route`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | How to Get My Husband on My Side (`.../how-to-get-my-husband-on-my-side`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 137 | Chapter 1 (`.../how-to-get-my-husband-on-my-side-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 69 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 2: title=How to Get My Husband on My Side, URL=`.../how-to-get-my-husband-on-my-side` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://arenascan.com/.../fdc8a2c6-42a5-4e2f-9243-4c34f6ff351b.jpg` (image/jpeg, 177180 bytes, 720x1030) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../how-to-get-my-husband-on-my-side` |  |  |  |
| details thumbnail URL | PASS | `https://arenascan.com/.../fdc8a2c6-42a5-4e2f-9243-4c34f6ff351b.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasy, Magic, Manhwa, Manhwa hot, Psychological, Romance, Webtoons, Manhwa |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Read manhwa How to Get My Husband on My Side / How to Make My Husband on My Side / How to Win My Husband Over / 남편을 내 편으로 만드는 방법 I became ‘Rudbeckia,’ a supporting character in a fantasy novel, a villainess who dies at the hands of her husband. The world’s most damned father has found me another partner for a political marriage. The problem is, that person is the husband who will kill me! First, I need to find a way to live. I need to appear as harmless as possible to the people of the North and protect my husband’s little sister whom I killed in the original novel. Wouldn’t I be able to save my life if I pretended to be in love with my husband? “I fell in love with you!” So please, spare me!<br><br>Alternative Names: How to Make My Husband on My Side / How to Win My Husband Over / 남편을 내 편으로 만드는 방법 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 137 chapters |  |  |  |
| chapter dates | PASS | 137 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 69 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.arenascan.com/.../01.webp` (image/webp (encoding: lossy), 78846 bytes, 940x2000) |  |  |  |
