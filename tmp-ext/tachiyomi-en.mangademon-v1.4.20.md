# Extension Validation Report

- Extension: tachiyomi-en.mangademon-v1.4.20
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2900023289777642714
- Source name: Manga Demon
- Source language: en
- Selected manga input: latest offset 0: The Former Supreme (`.../The-Former-Supreme`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 56 | Martial Peak (`.../Martial-Peak`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 56 | Barbarian's Adven... (`.../Barbarian%2527s-Adventure-in-a-Fantasy-World`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 40 | The Former Supreme (`.../The-Former-Supreme`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 40 | Mood Disorder (`.../Mood-Disorder`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Former Supreme (`.../The-Former-Supreme`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Former Supreme (`.../The-Former-Supreme`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 15 | Chapter 1 (`.../chaptered.php <redacted query values: manga and chapter>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| popular listing | PASS | 56 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Former Supreme, URL=`.../The-Former-Supreme` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 193/193 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 193/193 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://readermc.org/.../The Former Supreme.webp` (image/webp (encoding: lossy), 28310 bytes, 288x412) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../The-Former-Supreme` |  |  |  |
| details thumbnail URL | PASS | `https://readermc.org/.../The Former Supreme.webp` |  |  |  |
| details author | PASS | Younghoon Jang |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The Former Supreme is a Manga/Manhwa/Manhua in english language, Action series, english chapters have been translated and you can read them here. You are reading chapters on the fastest updating comic site. The Summary is Baek Socheon, once the unrivaled master of the Jianghu, has been reduced to a mere administrative post in name only. Though he has lost both his martial arts and his honor, his spirit remains unbroken... Starting once more from rock bottom, the former supreme sets out to reclaim the power he lost and the time he left behind. Thus begins the second martial legend of the man who was once the strongest. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 15 chapters |  |  |  |
| chapter dates | PASS | 15 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.demoniclibs.com/.../1.jpg` (image/jpeg, 1100948 bytes, 800x16763) |  |  |  |
