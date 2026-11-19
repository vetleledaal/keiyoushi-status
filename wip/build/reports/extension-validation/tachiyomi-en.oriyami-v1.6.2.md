# Extension Validation Report

- Extension: tachiyomi-en.oriyami-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3786594066286839843
- Source name: OriYami
- Source language: en
- Selected manga input: popular offset 0: Fabulous Beasts (`.../fabulous-beasts`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Fabulous Beasts (`.../fabulous-beasts`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Get Schooled (`.../get-schooled`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | unOrdinary (`.../unordinary`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Peerless Battle Spirit (`.../peerless-battle-spirit`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Fabulous Beasts (`.../fabulous-beasts`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Fabulous Beasts (`.../fabulous-beasts`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1266 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 4 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Fabulous Beasts, URL=`fabulous-beasts` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.oriyami.com/.../fabulous-beasts-137af5cb.png` (image/png, 65845 bytes, 160x213) |  |  |  |
| details identity | PASS | Details preserved selected URL `fabulous-beasts` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.oriyami.com/.../fabulous-beasts-137af5cb.png` |  |  |  |
| details author | PASS | Xue Xia Mao Yao Zi |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhua, Shounen, Comedy, Fantasy, Slice of Life, Tragedy, Non-Human Protagonists, Animal Protagonists, Mythology, Anthropomorphic |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★ 5.0 (1) · 2017 · Has anime<br><br>In a vibrant modern world where mythical creatures quietly coexist alongside human society, a specialized veterinarian opens a clinic dedicated exclusively to rare monsters and magical entities. From dragon hatchlings with digestive issues to depressed phoenixes refusing to molt, the clinic handles all manner of absurd, magical medical emergencies. Joined by a colorful staff of assistant spirits, the veterinarian navigates chaotic daily appointments, proving that even the most terrifying legendary beasts just need proper care.<br><br>**Alternative names:**<br>- Bestas Fabulosas<br>- There Are Beasts<br>- 有兽焉<br>- Existen Bestias<br>- Có Linh Thú<br>- Hữu Thú Yên<br>- สัตว์มหัศจรรย์<br>- มีสัตว์ป่าว<br>- You Shou Yan<br><br>**Links:**<br>- \[MangaUpdates\](https://www.mangaupdates.com/.../you-shou-yan)<br>- \[Mangadex\](https://mangadex.org/.../151bca3e-db98-4ad2-8d8d-239943b91437)<br>- \[MyAnimeList\](https://myanimelist.net/.../159325)<br>- \[Anime-Planet\](https://www.anime-planet.com/.../there-are-beasts)<br>- \[Kitsu\](https://kitsu.app/.../you-shou-yan) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1266 chapters |  |  |  |
| chapter dates | PASS | 1266 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.oriyami.com/.../50539597.jpg` (image/jpeg, 252106 bytes, 800x2225) |  |  |  |
