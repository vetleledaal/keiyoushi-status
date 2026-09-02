# Extension Validation Report

- Extension: tachiyomi-en.asurascans-v1.6.69
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6247824327199706550
- Source name: Asura Scans
- Source language: en
- Selected manga input: popular offset 0: Absolute Sword Sense (`.../absolute-sword-sense`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Absolute Sword Sense (`.../absolute-sword-sense`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Eternally Regressing Knight (`.../eternally-regressing-knight`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Limitless Predation (`.../limitless-predation`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | The Max Level Hero has Returned! (`.../the-max-level-hero-has-returned`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Absolute Sword Sense (`.../absolute-sword-sense`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Absolute Sword Sense (`.../absolute-sword-sense`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 199 | Chapter 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Absolute Sword Sense, URL=`.../absolute-sword-sense` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.asurascans.com/.../absolute-sword-sense.09c12f.webp` (image/png, 2338322 bytes, 1042x1510) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../absolute-sword-sense` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.asurascans.com/.../absolute-sword-sense.09c12f.webp` |  |  |  |
| details author | PASS | Hanjung Wolya |  |  |  |
| details artist | PASS | Elimona |  |  |  |
| details genres | PASS | Manhwa, Action, Adventure, Murim, Reincarnation |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Rank: #1 • Rating: 9.57 • Bookmarks: 76.3K<br><br>After being given up on by his family because his dantian was destroyed, Soh Woonhwi was kidnapped by the Blood Cult and lived as a third-rate spy. One day, he died while being used to find a legendary sword immortal's secret records. However, he returned to the day he was kidnapped ten years ago and obtained a mysterious ability that allowed him to hear the voice of swords.<br><br>Alternative Titles:<br>- Le Sens de l'épée<br>- El espadachín absoluto<br>- 절대검감<br>- เซียนสัมผัสดาบ<br>- Perfect Sword Sense<br>- 絶對劍感<br>- 絶対剣感<br>- 绝对剑感<br>- Absolute Sword Feeling<br>- Sense of Absolute Sword<br>- Absolute Sword Perception<br>- Jeoldae Geomgam<br>- ASS<br>- Cảm Ngộ Kiếm Thuật Tuyệt Đối<br>- Sentido Absoluto de la Espada<br>- Sentido de Espada Absoluto<br>- Insting Pedang Mutlak<br>- 절대剣感<br>- Абсолютное чувство меча<br>- إحساس السيف المطلق |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 199 chapters |  |  |  |
| chapter dates | PASS | 199 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.asurascans.com/.../001.webp <redacted query values: v>` (image/webp (encoding: lossy), 208466 bytes, 1200x800) |  |  |  |
