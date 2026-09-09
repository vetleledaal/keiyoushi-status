# Extension Validation Report

- Extension: tachiyomi-en.rokaricomics-v1.4.34
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 830150807344972132
- Source name: RokariComics
- Source language: en
- Selected manga input: latest offset 0: I Married the Impotent Duke, and Now I Want to Protect His Son (`.../i-married-the-impotent-duke-and-now-i-want-to-protect-his-son`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Surviving Among the Heirs (`.../surviving-among-the-heirs`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | I Married the Impotent Duke, and Now I Want to Protect His Son (`.../i-married-the-impotent-duke-and-now-i-want-to-protect-his-son`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | The Villainous Admiral Wants to Catch Me in His Net (`.../the-villainous-admiral-wants-to-catch-me-in-his-net`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | I Married the Impotent Duke, and Now I Want to Protect His Son (`.../i-married-the-impotent-duke-and-now-i-want-to-protect-his-son`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | I Married the Impotent Duke, and Now I Want to Protect His Son (`.../i-married-the-impotent-duke-and-now-i-want-to-protect-his-son`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 17 | Chapter 1 (`.../i-married-the-impotent-duke-and-now-i-want-to-protect-his-son-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Married the Impotent Duke, and Now I Want to Protect His Son, URL=`.../i-married-the-impotent-duke-and-now-i-want-to-protect-his-son` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rokaricomics.com/.../%E4%B8%8D%E8%83%BD%E5%85%AC%E7%88%B5%E3%81%AB%E5%AB%81%E3%81%84%E3%81%A0%E3%82%89%E3%80%81%E5%AD%90%E4%BE%9B%E3%82%92%E5%AE%88%E3%82%8A%E3%81%9F%E3%81%8F%E3%81%AA%E3%82%8A%E3%81%BE%E3%81%97%E3%81%9F-4x.webp` (image/webp (encoding: lossless), 6068700 bytes, 2400x3392) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../i-married-the-impotent-duke-and-now-i-want-to-protect-his-son` |  |  |  |
| details thumbnail URL | PASS | `https://rokaricomics.com/.../%E4%B8%8D%E8%83%BD%E5%85%AC%E7%88%B5%E3%81%AB%E5%AB%81%E3%81%84%E3%81%A0%E3%82%89%E3%80%81%E5%AD%90%E4%BE%9B%E3%82%92%E5%AE%88%E3%82%8A%E3%81%9F%E3%81%8F%E3%81%AA%E3%82%8A%E3%81%BE%E3%81%97%E3%81%9F-4x.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasy, Romance, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Emily, the illegitimate daughter of a count, spent her whole life enduring mistreatment and blindly obeying her family just to earn a place to belong. But one day, they cast her aside like trash, forcing her into a marriage with Duke Lumeia—a man feared across the realm as the “Impotent Duke.” Uncovering the shocking truth behind her mother’s death, Emily vows never to be anyone’s puppet again: (): I won’t let anyone push me around anymore. This time, I’m taking control of my own life—! Yet the moment she crosses the threshold of the duke’s manor, she is greeted by Leon, a fiercely guarded little boy on high alert… To make matters worse, Duke Lumeia himself gives her an ice-cold reception: “”: You don’t need to do a single thing here. But as Emily slowly opens her heart to young Leon, an unfamiliar warmth begins to bloom within her. And as it turns out, there is a hidden secret lurking behind the rumors of the duke’s “impotence”…<br><br>Alternative Names: 不能公爵に嫁いだら、子供を守りたくなりました |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | PASS | 17 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://rokaricomics.com/.../08b5c63ef7d6ee6cce487ba952f6599f.jpg` (image/jpeg, 2487812 bytes, 800x10000) |  |  |  |
