# Extension Validation Report

- Extension: tachiyomi-en.arenascans-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 8861274191478178487
- Source name: Arena Scans
- Source language: en
- Selected manga input: latest offset 0: Nano Machine (`.../nano-machine`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | How to Get My Husband on My Side (`.../how-to-get-my-husband-on-my-side`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Return of the First Patriarch: The Strongest Reincarnates into His Descendant 1000 Years Later (`.../return-of-the-first-patriarch-the-strongest-reincarnates-into-his-descendant-1000-years-later`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Nano Machine (`.../nano-machine`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | That’s Not What My Will Said (`.../thats-not-what-my-will-said`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Glitch Utopia (`.../glitch-utopia`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Nano Machine (`.../nano-machine`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 324 | Chapter 1 (`.../nano-machine-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 26 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Nano Machine, URL=`.../nano-machine` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://arenascan.com/.../32b4b72c-620c-46a7-8f94-a0f843fd82a4.jpg` (image/jpeg, 291840 bytes, 720x1020) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../nano-machine` |  |  |  |
| details thumbnail URL | PASS | `https://arenascan.com/.../32b4b72c-620c-46a7-8f94-a0f843fd82a4.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Manhwa, Martial arts, Webtoons, Manhwa |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Read manhwa Nano Machine / Nano Mashin / 喇勞 魔神 / 奈米魔神 / 某天成为魔神 / 나노마신 After being held in disdain and having his life put in danger, an orphan from the Demonic Cult, Cheon Yeo-Woon, has an unexpected visit from his descendant from the future who inserts a nano machine into Cheon Yeo-Woon’s body, which drastically changes Cheon Yeo-Woon’s life after its activation. The story of Cheon Yeo-Woon’s journey of bypassing the Demonic Cult and rising to become the best martial artist has just begun.<br><br>Alternative Names: Nano Mashin / 喇勞 魔神 / 奈米魔神 / 某天成为魔神 / 나노마신 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 324 chapters |  |  |  |
| chapter dates | PASS | 324 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.arenascan.com/.../001.jpg` (image/jpeg, 203197 bytes, 1238x800) |  |  |  |
