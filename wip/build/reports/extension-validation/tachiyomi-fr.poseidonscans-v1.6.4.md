# Extension Validation Report

- Extension: tachiyomi-fr.poseidonscans-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8936307069044646761
- Source name: Poseidon Scans
- Source language: fr
- Selected manga input: popular offset 0: Solo leveling : Ragnarok (`.../solo-leveling-ragnarok`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | Solo leveling : Ragnarok (`.../solo-leveling-ragnarok`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 16 | The Genius Knight of a Fallen Race (`.../the-genius-knight-of-a-fallen-race`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 16 | Reality Quest (`.../reality-quest-9675`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Solo leveling : Ragnarok (`.../solo-leveling-ragnarok`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Solo leveling : Ragnarok (`.../solo-leveling-ragnarok`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 73 | Chapitre 0 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 6 |  |  | <1s |

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
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Solo leveling : Ragnarok, URL=`.../solo-leveling-ragnarok` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 39/39 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 39/39 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://poseidon-scans.net/.../solo-leveling-ragnarok.webp` (image/webp (encoding: lossy), 199628 bytes, 1049x1500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../solo-leveling-ragnarok` |  |  |  |
| details thumbnail URL | PASS | `https://poseidon-scans.net/.../solo-leveling-ragnarok.webp` |  |  |  |
| details author | PASS | Daul |  |  |  |
| details artist | PASS | Dangdo, Redice Studio |  |  |  |
| details genres | PASS | Magie, Fantastique, Combat, Aventure, Action |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Une autre histoire de Daul, l’auteur de \[Infinite Reset\] et \[Dungeon Reset\] ! \[Solo Leveling : Ragnarok\] Seong Sooho vivait comme un étudiant ordinaire jusqu’au moment où, avant sa mort, son héritage unique, qui était en sommeil, s’est réveillé ! « Lève-toi. » Un chasseur qui défie et commande la mort. Surveillez sa croissance et ses montées en niveau ! *** \[« Solo Leveling : Ragnarok » est un spin-off de « Solo Leveling »\].<br><br>L’existence de la Terre est à nouveau menacée car les Itarim, les dieux des autres univers, cherchent à combler le vide laissé par l’Être absolu. Sung Jinwoo n’a d’autre choix que d’envoyer Beru, le roi des fourmis de l’ombre, pour réveiller les pouvoirs de son fils et lui faire reprendre le chemin qu’il a déjà emprunté. Suho doit conquérir le donjon des ombres et gagner sa place dans le monde des chasseurs en naviguant dans un nouveau monde contre un nouveau mal qui cherche à engloutir le monde entier. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 73 chapters |  |  |  |
| chapter dates | PASS | 73 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://poseidon-scans.net` to `https://poseidon-scans.net <redacted query values: _rsc>` (1 redirects); popular: `https://poseidon-scans.net/.../solo-leveling-ragnarok` to `https://poseidon-scans.net/.../solo-leveling-ragnarok <redacted query values: _rsc>` (1 redirects); popular: `https://poseidon-scans.net/.../0` to `https://poseidon-scans.net/.../0 <redacted query values: _rsc>` (1 redirects) |  |  |  |
| page load | PASS | `https://poseidon-scans.net/.../fa151643-7eb9-413b-a556-579fcadf58b7` (image/webp (encoding: lossy), 152168 bytes, 735x1219) |  |  |  |
