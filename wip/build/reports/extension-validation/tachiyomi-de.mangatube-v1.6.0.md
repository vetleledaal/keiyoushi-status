# Extension Validation Report

- Extension: tachiyomi-de.mangatube-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 28
- Lint: 1
- Warnings: 1
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6851437974515624757
- Source name: Manga Tube
- Source language: de
- Selected manga input: popular offset 0: One Piece (`.../one_piece`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | One Piece (`.../one_piece`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | error | 0 |  | java.io.IOException: Challenge validation failed: 405 | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 9 | One Piece Theorien (`.../one_piece_theorien`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../one_piece`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | Ch. 1191 - Loki ist hier (`.../19808`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | ERROR | java.io.IOException: Challenge validation failed: 405 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | SKIP | Challenge validation failed: 405 |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 8: title=One Piece, URL=`.../one_piece` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Challenge validation failed: 405 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 19/19 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 19/19 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://a.mtcdn.org/.../min_536969a1e0eab69e675f253735a90807de1115b2.png` (image/png, 21426 bytes, 74x117) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one_piece` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://a.mtcdn.org/.../max_536969a1e0eab69e675f253735a90807de1115b2.png` (image/png, 140681 bytes, 200x315) |  |  |  |
| details author | PASS | Eiichiro Oda |  |  |  |
| details artist | PASS | Oda Eiichiro |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Reichtum, Macht und Ruhm. Der Mann, der sich dies alles erkämpft hatte, war Gold Roger, der König der Piraten. Als er hingerichtet wurde, waren seine letzten Worte: 'Ihr wollt meinen Schatz? Den könnt ihr haben! Sucht ihn doch! Irgendwo habe ich den größten Schatz der Welt versteckt.' Dieser Schatz ist das One Piece und er liegt irgendwo auf der Grandline. Damit brach das große Piratenzeitalter an... Monkey D. Ruffy ist 16 Jahre alt und hat ein großes Ziel: Er will König der Piraten werden und den Schatz One Piece finden! Ruffy hat besondere Kräfte durch die Teufelsfrucht 'GumGum' erhalten und ist ein Gummimensch. Er hat seinen Traum von dem Pirat Shanks, der ihm einst das Leben rettete und Ruffy kurz vor seiner Abreise seinen, ihm sehr wichtigen, Strohhut schenkte. Zunächst muss er also eine Mannschaft und ein Schiff finden... Gesagt, getan! Mit dem starken Schwertkämpfer Zorro, dem Lügenbold Usopp, der hübschen Nami, dem Meisterkoch Sanji und später auch dem Elch Chopper und einigen weiteren schafft er sich ein zwar merkwürdiges, doch perfektes Team. Die nun entstandene 'Strohhutbande' (von Ruffys Strohhut abgeleitet) hat aber viel Ärger mit ihrem durchgeknallten Gummikäpten, doch das ist längst nicht das einzige Problem, denn viele Fieslinge stellen sich der Bande in den Weg. Da wäre zum Beispiel Käpt'n Black, der Usopps Dorf vernichten wollte, Arlong, der Schuld ans Namis düsterer Vergangenheit ist, usw. auch die Marine stellt sich der Bande in den Weg... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://a.mtcdn.org/.../001_p0oP9I.png` (image/png, 5927451 bytes, 1509x2200) |  |  |  |
